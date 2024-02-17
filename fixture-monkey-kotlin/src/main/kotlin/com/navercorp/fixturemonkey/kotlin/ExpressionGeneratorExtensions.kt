@file:Suppress("unused")

package com.navercorp.fixturemonkey.kotlin

import com.navercorp.fixturemonkey.ArbitraryBuilder
import com.navercorp.fixturemonkey.Constants
import com.navercorp.fixturemonkey.api.expression.ExpressionGenerator
import java.util.function.Predicate
import java.util.function.Supplier
import kotlin.reflect.KFunction1
import kotlin.reflect.KProperty1

fun <T> ArbitraryBuilder<T>.setExp(expressionGenerator: ExpressionGenerator, value: Any?): ArbitraryBuilder<T> =
    this.set(expressionGenerator, value)

fun <T> ArbitraryBuilder<T>.setExp(
    expressionGenerator: ExpressionGenerator,
    value: Any?,
    limit: Long
): ArbitraryBuilder<T> =
    this.set(expressionGenerator, value, limit.toInt())

@JvmName("setRootExp")
fun <T> ArbitraryBuilder<T>.setExp(
    property: KProperty1<T, Class<T>>,
    value: Any?,
    limit: Long = Constants.MAX_MANIPULATION_COUNT.toLong()
): ArbitraryBuilder<T> =
    this.set("$", value, limit.toInt())

fun <T> ArbitraryBuilder<T>.setExpGetter(expressionGenerator: ExpressionGenerator, value: Any?): ArbitraryBuilder<T> =
    this.set(expressionGenerator, value)

fun <T> ArbitraryBuilder<T>.setExpGetter(
    expressionGenerator: ExpressionGenerator,
    value: Any?,
    limit: Long
): ArbitraryBuilder<T> =
    this.set(expressionGenerator, value, limit.toInt())

fun <T> ArbitraryBuilder<T>.setExpGetter(
    property: KProperty1<T, Class<T>>,
    value: Any?,
    limit: Long = Constants.MAX_MANIPULATION_COUNT.toLong()
): ArbitraryBuilder<T> =
    this.set("$", value, limit.toInt())

fun <T> ArbitraryBuilder<T>.setNullExp(expressionGenerator: ExpressionGenerator): ArbitraryBuilder<T> =
    this.setNull(expressionGenerator)

@JvmName("setNullRootExpExplicitly")
fun <T> ArbitraryBuilder<T>.setNullExp(property: KProperty1<T, Class<T>>): ArbitraryBuilder<T> =
    this.setNull("$")

fun <T> ArbitraryBuilder<T>.setNullExpGetter(expressionGenerator: ExpressionGenerator): ArbitraryBuilder<T> =
    this.setNull(expressionGenerator)

@JvmName("setNullRootExpGetter")
fun <T> ArbitraryBuilder<T>.setNullExpGetter(property: KProperty1<T, Class<T>>): ArbitraryBuilder<T> =
    this.setNull("$")

fun <T> ArbitraryBuilder<T>.setNotNullExp(expressionGenerator: ExpressionGenerator): ArbitraryBuilder<T> =
    this.setNotNull(expressionGenerator)

@JvmName("setNotNullRootExpExplicitly")
fun <T> ArbitraryBuilder<T>.setNotNullExp(property: KProperty1<T, Class<T>>): ArbitraryBuilder<T> =
    this.setNotNull("$")

fun <T> ArbitraryBuilder<T>.setNotNullExpGetter(expressionGenerator: ExpressionGenerator): ArbitraryBuilder<T> =
    this.setNotNull(expressionGenerator)

@JvmName("setNotNullRootExpGetter")
fun <T> ArbitraryBuilder<T>.setNotNullExpGetter(property: KProperty1<T, Class<T>>): ArbitraryBuilder<T> =
    this.setNotNull("$")

fun <T, U> ArbitraryBuilder<T>.setPostConditionExp(
    property: KProperty1<T, *>,
    clazz: Class<U>,
    filter: Predicate<U>
): ArbitraryBuilder<T> =
    this.setPostCondition(
        "$",
        clazz,
        filter
    )

fun <T, U> ArbitraryBuilder<T>.setPostConditionExp(
    expressionGenerator: ExpressionGenerator,
    clazz: Class<U>,
    filter: Predicate<U>,
    limit: Long
): ArbitraryBuilder<T> =
    this.setPostCondition(
        expressionGenerator,
        clazz,
        filter,
        limit.toInt()
    )

inline fun <reified T> ArbitraryBuilder<T>.setPostConditionExp(
    property: KProperty1<T, Class<T>>,
    filter: Predicate<T>,
    limit: Long = Constants.MAX_MANIPULATION_COUNT.toLong()
): ArbitraryBuilder<T> =
    this.setPostCondition(
        "$",
        T::class.java,
        filter,
        limit.toInt()
    )

fun <T, U> ArbitraryBuilder<T>.setPostConditionExp(
    expressionGenerator: ExpressionGenerator,
    clazz: Class<U>,
    filter: Predicate<U>
): ArbitraryBuilder<T> =
    this.setPostCondition(
        expressionGenerator,
        clazz,
        filter
    )

fun <T, U> ArbitraryBuilder<T>.setPostConditionExpGetter(
    expressionGenerator: ExpressionGenerator,
    clazz: Class<U>,
    filter: Predicate<U>,
    limit: Long
): ArbitraryBuilder<T> =
    this.setPostCondition(
        expressionGenerator,
        clazz,
        filter,
        limit.toInt()
    )

inline fun <reified T> ArbitraryBuilder<T>.setPostConditionExpGetter(
    property: KProperty1<T, Class<T>>,
    filter: Predicate<T>,
    limit: Long = Constants.MAX_MANIPULATION_COUNT.toLong()
): ArbitraryBuilder<T> =
    this.setPostCondition(
        "$",
        T::class.java,
        filter,
        limit.toInt()
    )

fun <T, U> ArbitraryBuilder<T>.setPostConditionExpGetter(
    expressionGenerator: ExpressionGenerator,
    clazz: Class<U>,
    filter: Predicate<U>
): ArbitraryBuilder<T> =
    this.setPostCondition(
        expressionGenerator,
        clazz,
        filter
    )

fun <T> ArbitraryBuilder<T>.sizeExp(
    expressionGenerator: ExpressionGenerator,
    size: Int
): ArbitraryBuilder<T> =
    this.size(expressionGenerator, size)

@JvmName("sizeRootExpExplicitly")
fun <T> ArbitraryBuilder<T>.sizeExp(
    property: KProperty1<T, Class<T>>,
    size: Int
): ArbitraryBuilder<T> =
    this.size("$", size)

fun <T> ArbitraryBuilder<T>.sizeExpGetter(
    expressionGenerator: ExpressionGenerator,
    size: Int
): ArbitraryBuilder<T> =
    this.size(expressionGenerator, size)

fun <T> ArbitraryBuilder<T>.sizeExpGetter(
    property: KProperty1<T, Class<T>>,
    size: Int
): ArbitraryBuilder<T> =
    this.size("$", size)

fun <T> ArbitraryBuilder<T>.sizeExp(
    expressionGenerator: ExpressionGenerator,
    min: Int,
    max: Int
): ArbitraryBuilder<T> =
    this.size(expressionGenerator, min, max)

@JvmName("sizeRootExpExplicitly")
fun <T> ArbitraryBuilder<T>.sizeExp(
    property: KProperty1<T, Class<T>>,
    min: Int,
    max: Int
): ArbitraryBuilder<T> = this.size("$", min, max)

fun <T> ArbitraryBuilder<T>.sizeExpGetter(
    expressionGenerator: ExpressionGenerator,
    min: Int,
    max: Int
): ArbitraryBuilder<T> =
    this.size(expressionGenerator, min, max)

fun <T> ArbitraryBuilder<T>.sizeExpGetter(
    property: KProperty1<T, Class<T>>,
    min: Int,
    max: Int
): ArbitraryBuilder<T> =
    this.size("$", min, max)

fun <T> ArbitraryBuilder<T>.minSizeExp(
    expressionGenerator: ExpressionGenerator,
    min: Int
): ArbitraryBuilder<T> =
    this.minSize(expressionGenerator, min)

@JvmName("minSizeRootExpExplicitly")
fun <T> ArbitraryBuilder<T>.minSizeExp(
    property: KProperty1<T, Class<T>>,
    min: Int
): ArbitraryBuilder<T> = this.minSize("$", min)

fun <T> ArbitraryBuilder<T>.minSizeExpGetter(
    expressionGenerator: ExpressionGenerator,
    min: Int
): ArbitraryBuilder<T> =
    this.minSize(expressionGenerator, min)

fun <T> ArbitraryBuilder<T>.minSizeExpGetter(
    property: KProperty1<T, Class<T>>,
    min: Int
): ArbitraryBuilder<T> = this.minSize("$", min)

fun <T> ArbitraryBuilder<T>.maxSizeExp(
    expressionGenerator: ExpressionGenerator,
    max: Int
): ArbitraryBuilder<T> =
    this.maxSize(expressionGenerator, max)

@JvmName("maxSizeRootExpExplicitly")
fun <T> ArbitraryBuilder<T>.maxSizeExp(
    property: KProperty1<T, Class<T>>,
    max: Int
): ArbitraryBuilder<T> = this.maxSize("$", max)

fun <T> ArbitraryBuilder<T>.maxSizeExpGetter(
    expressionGenerator: ExpressionGenerator,
    max: Int
): ArbitraryBuilder<T> =
    this.maxSize(expressionGenerator, max)

fun <T> ArbitraryBuilder<T>.maxSizeExpGetter(
    property: KProperty1<T, Class<T>>,
    max: Int
): ArbitraryBuilder<T> = this.maxSize("$", max)

fun <T> ArbitraryBuilder<T>.setLazyExp(
    expressionGenerator: ExpressionGenerator,
    supplier: Supplier<Any?>
): ArbitraryBuilder<T> =
    this.setLazy(expressionGenerator, supplier)

fun <T> ArbitraryBuilder<T>.setLazyExp(
    expressionGenerator: ExpressionGenerator,
    supplier: Supplier<Any?>,
    limit: Long
): ArbitraryBuilder<T> =
    this.setLazy(expressionGenerator, supplier, limit.toInt())

@JvmName("setLazyRootExp")
fun <T> ArbitraryBuilder<T>.setLazyExp(
    property: KProperty1<T, Class<T>>,
    supplier: Supplier<Any?>,
    limit: Long = Constants.MAX_MANIPULATION_COUNT.toLong()
): ArbitraryBuilder<T> = this.setLazy("$", supplier, limit.toInt())

fun <T> ArbitraryBuilder<T>.setLazyExpGetter(
    expressionGenerator: ExpressionGenerator,
    supplier: Supplier<Any?>
): ArbitraryBuilder<T> =
    this.setLazy(expressionGenerator, supplier)

fun <T> ArbitraryBuilder<T>.setLazyExpGetter(
    expressionGenerator: ExpressionGenerator,
    supplier: Supplier<Any?>,
    limit: Long
): ArbitraryBuilder<T> =
    this.setLazy(expressionGenerator, supplier, limit.toInt())

fun <T> ArbitraryBuilder<T>.setLazyExpGetter(
    property: KProperty1<T, Class<T>>,
    supplier: Supplier<Any?>,
    limit: Long = Constants.MAX_MANIPULATION_COUNT.toLong()
): ArbitraryBuilder<T> = this.setLazy("$", supplier, limit.toInt())

@JvmName("setRootExp")
fun <T> ArbitraryBuilder<T>.set(property: KProperty1<T, Class<T>>, value: Any?): ArbitraryBuilder<T> =
    this.set("$", value)

fun <T> ArbitraryBuilder<T>.set(property: KProperty1<T, Any?>, value: Any?): ArbitraryBuilder<T> =
    this.set(property(property), value)

fun <T> ArbitraryBuilder<T>.set(property: KProperty1<T, Any?>, value: Any?, limit: Long): ArbitraryBuilder<T> =
    this.set(property(property), value, limit.toInt())

fun <T> ArbitraryBuilder<T>.setExp(property: KProperty1<T, Any?>, value: Any?): ArbitraryBuilder<T> =
    this.set(property(property), value)

fun <T> ArbitraryBuilder<T>.setExp(property: KProperty1<T, Any?>, value: Any?, limit: Long): ArbitraryBuilder<T> =
    this.set(property(property), value, limit.toInt())

@JvmName("setNullRootExp")
fun <T> ArbitraryBuilder<T?>.setNull(property: KProperty1<T, Class<T>>): ArbitraryBuilder<T?> =
    this.setNull("$")

fun <T> ArbitraryBuilder<T>.setNull(property: KProperty1<T, *>): ArbitraryBuilder<T> =
    this.setNull(property(property))

fun <T> ArbitraryBuilder<T>.setNullExp(property: KProperty1<T, *>): ArbitraryBuilder<T> =
    this.setNull(property(property))

fun <T> ArbitraryBuilder<T>.setNotNull(property: KProperty1<T, *>): ArbitraryBuilder<T> =
    this.setNotNull(property(property))

@JvmName("setNotNullRootExp")
fun <T> ArbitraryBuilder<T?>.setNotNull(property: KProperty1<T, Class<T>>): ArbitraryBuilder<T?> =
    this.setNotNull("$")

fun <T> ArbitraryBuilder<T>.setNotNullExp(property: KProperty1<T, *>): ArbitraryBuilder<T> =
    this.setNotNull(property(property))

fun <T, U> ArbitraryBuilder<T>.setPostCondition(
    property: KProperty1<T, *>,
    clazz: Class<U>,
    filter: Predicate<U>
): ArbitraryBuilder<T> =
    this.setPostCondition(
        property(property),
        clazz,
        filter
    )

fun <T, U> ArbitraryBuilder<T>.setPostCondition(
    property: KProperty1<T, *>,
    clazz: Class<U>,
    filter: Predicate<U>,
    limit: Long
): ArbitraryBuilder<T> =
    this.setPostCondition(
        property(property),
        clazz,
        filter,
        limit.toInt()
    )

inline fun <reified T> ArbitraryBuilder<T>.setPostCondition(
    property: KProperty1<T, Class<T>>,
    filter: Predicate<T>
): ArbitraryBuilder<T> =
    this.setPostCondition(
        "$",
        T::class.java,
        filter
    )

inline fun <reified T> ArbitraryBuilder<T>.setPostCondition(
    property: KProperty1<T, Class<T>>,
    filter: Predicate<T>,
    limit: Long
): ArbitraryBuilder<T> =
    this.setPostCondition(
        "$",
        T::class.java,
        filter,
        limit.toInt()
    )

fun <T, U> ArbitraryBuilder<T>.setPostConditionExp(
    property: KProperty1<T, *>,
    clazz: Class<U>,
    filter: Predicate<U>,
    limit: Long
): ArbitraryBuilder<T> =
    this.setPostCondition(
        property(property),
        clazz,
        filter,
        limit.toInt()
    )

fun <T> ArbitraryBuilder<T>.size(
    property: KProperty1<T, *>,
    size: Int
): ArbitraryBuilder<T> = this.size(property(property), size)

@JvmName("sizeRootExp")
fun <T> ArbitraryBuilder<T>.size(
    property: KProperty1<T, Class<T>>,
    size: Int
): ArbitraryBuilder<T> = this.size("$", size)

fun <T> ArbitraryBuilder<T>.size(
    property: KProperty1<T, *>,
    min: Int,
    max: Int
): ArbitraryBuilder<T> = this.size(property(property), min, max)

@JvmName("sizeRootExp")
fun <T> ArbitraryBuilder<T>.size(
    property: KProperty1<T, Class<T>>,
    min: Int,
    max: Int
): ArbitraryBuilder<T> = this.size("$", min, max)

fun <T> ArbitraryBuilder<T>.sizeExp(
    property: KProperty1<T, *>,
    size: Int
): ArbitraryBuilder<T> = this.size(property(property), size)

fun <T> ArbitraryBuilder<T>.sizeExp(
    property: KProperty1<T, *>,
    min: Int,
    max: Int
): ArbitraryBuilder<T> = this.size(property(property), min, max)

fun <T> ArbitraryBuilder<T>.minSize(
    property: KProperty1<T, *>,
    min: Int
): ArbitraryBuilder<T> = this.minSize(property(property), min)

@JvmName("minSizeRootExp")
fun <T> ArbitraryBuilder<T>.minSize(
    property: KProperty1<T, Class<T>>,
    min: Int
): ArbitraryBuilder<T> = this.minSize("$", min)

fun <T> ArbitraryBuilder<T>.minSizeExp(
    property: KProperty1<T, *>,
    min: Int
): ArbitraryBuilder<T> = this.minSize(property(property), min)

fun <T> ArbitraryBuilder<T>.maxSize(
    property: KProperty1<T, *>,
    max: Int
): ArbitraryBuilder<T> = this.maxSize(property(property), max)

@JvmName("maxSizeRootExp")
fun <T> ArbitraryBuilder<T>.maxSize(
    property: KProperty1<T, Class<T>>,
    min: Int
): ArbitraryBuilder<T> = this.maxSize("$", min)

fun <T> ArbitraryBuilder<T>.maxSizeExp(
    property: KProperty1<T, *>,
    max: Int
): ArbitraryBuilder<T> = this.maxSize(property(property), max)

fun <T> ArbitraryBuilder<T>.setLazyExp(
    property: KProperty1<T, Any?>,
    supplier: Supplier<Any?>
): ArbitraryBuilder<T> = this.setLazy(property(property), supplier)

fun <T> ArbitraryBuilder<T>.setLazyExp(
    property: KProperty1<T, Any?>,
    supplier: Supplier<Any?>,
    limit: Long
): ArbitraryBuilder<T> = this.setLazy(property(property), supplier, limit.toInt())

fun <T> ArbitraryBuilder<T>.setLazy(
    property: KProperty1<T, Any?>,
    supplier: Supplier<Any?>
): ArbitraryBuilder<T> = this.setLazy(property(property), supplier)

fun <T> ArbitraryBuilder<T>.setLazy(
    property: KProperty1<T, Any?>,
    supplier: Supplier<Any?>,
    limit: Long
): ArbitraryBuilder<T> = this.setLazy(property(property), supplier, limit.toInt())

@JvmName("setLazyRoot")
fun <T> ArbitraryBuilder<T>.setLazy(
    property: KProperty1<T, Class<T>>,
    supplier: Supplier<Any?>
): ArbitraryBuilder<T> = this.setLazy("$", supplier)

@JvmName("setLazyRoot")
fun <T> ArbitraryBuilder<T>.setLazy(
    property: KProperty1<T, Class<T>>,
    supplier: Supplier<Any?>,
    limit: Long
): ArbitraryBuilder<T> = this.setLazy("$", supplier, limit.toInt())

fun <T> ArbitraryBuilder<T>.setExpGetter(property: KFunction1<T, Any?>, value: Any?): ArbitraryBuilder<T> =
    this.set(property(property), value)

fun <T> ArbitraryBuilder<T>.setExpGetter(property: KFunction1<T, Any?>, value: Any?, limit: Long): ArbitraryBuilder<T> =
    this.set(
        property(property),
        value,
        limit.toInt()
    )

fun <T> ArbitraryBuilder<T>.setNullExpGetter(property: KFunction1<T, *>): ArbitraryBuilder<T> =
    this.setNull(property(property))

fun <T> ArbitraryBuilder<T>.setNotNullExpGetter(property: KFunction1<T, *>): ArbitraryBuilder<T> =
    this.setNotNull(property(property))

fun <T, U> ArbitraryBuilder<T>.setPostConditionExpGetter(
    property: KFunction1<T, *>,
    clazz: Class<U>,
    filter: Predicate<U>,
    limit: Long
): ArbitraryBuilder<T> =
    this.setPostCondition(
        property(property),
        clazz,
        filter,
        limit.toInt()
    )

fun <T, U> ArbitraryBuilder<T>.setPostConditionExpGetter(
    property: KFunction1<T, *>,
    clazz: Class<U>,
    filter: Predicate<U>
): ArbitraryBuilder<T> =
    this.setPostCondition(
        property(property),
        clazz,
        filter
    )

fun <T> ArbitraryBuilder<T>.sizeExpGetter(
    property: KFunction1<T, *>,
    size: Int
): ArbitraryBuilder<T> =
    this.size(property(property), size)

fun <T> ArbitraryBuilder<T>.sizeExpGetter(
    property: KFunction1<T, *>,
    min: Int,
    max: Int
): ArbitraryBuilder<T> =
    this.size(property(property), min, max)

fun <T> ArbitraryBuilder<T>.minSizeExpGetter(
    property: KFunction1<T, *>,
    min: Int
): ArbitraryBuilder<T> =
    this.minSize(property(property), min)

fun <T> ArbitraryBuilder<T>.maxSizeExpGetter(
    property: KFunction1<T, *>,
    max: Int
): ArbitraryBuilder<T> =
    this.maxSize(property(property), max)

fun <T> ArbitraryBuilder<T>.setLazyExpGetter(
    property: KFunction1<T, Any?>,
    supplier: Supplier<Any?>
): ArbitraryBuilder<T> =
    this.setLazy(property(property), supplier)

fun <T> ArbitraryBuilder<T>.setLazyExpGetter(
    property: KFunction1<T, Any?>,
    supplier: Supplier<Any?>,
    limit: Long
): ArbitraryBuilder<T> =
    this.setLazy(property(property), supplier, limit.toInt())
