/*
 * Fixture Monkey
 *
 * Copyright (c) 2021-present NAVER Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.navercorp.fixturemonkey.tests.springtests.config;

import java.net.URI;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

import com.navercorp.fixturemonkey.tests.springtests.test.ComplexType;

@Component
@RequiredArgsConstructor
public class TestApiClient {
	private final WebClient webClient;

	public Mono<String> getMonoString() {
		return Mono.just("test");
	}

	public Mono<String> getMonoEmpty() {
		return Mono.empty();
	}

	public Mono<String> fetch() {
		return webClient.get()
			.uri(URI.create("localhost:8080"))
			.retrieve()
			.bodyToMono(String.class);
	}

	public String getRawString() {
		return "test";
	}

	public String getNull() {
		return null;
	}

	public static String getStaticString() {
		return "test";
	}

	public ComplexType getComplexType() {
		return new ComplexType("test");
	}
}
