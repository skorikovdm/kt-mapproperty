package org.test

import io.micronaut.context.annotation.EachProperty
import io.micronaut.context.annotation.Parameter
import io.micronaut.core.convert.format.MapFormat

@EachProperty("bean")
class BeanConfiguration(@Parameter val name: String) {

    @MapFormat(transformation = MapFormat.MapTransformation.FLAT)
    var properties: Map<String, Any>? = null

    override fun toString(): String {
        return "${super.toString()} [name=$name, properties=$properties]"
    }
}