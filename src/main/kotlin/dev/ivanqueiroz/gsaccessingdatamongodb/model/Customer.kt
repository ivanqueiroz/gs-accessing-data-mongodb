package dev.ivanqueiroz.gsaccessingdatamongodb.model

import org.springframework.data.annotation.Id

data class Customer(
    @Id
    var id: String? = null,
    val firstName: String,
    val lastName: String
) {
    constructor(firstName: String, lastName: String) : this(null, firstName, lastName)
    override fun toString(): String {
        return "Customer(id=$id, firstName='$firstName', lastName='$lastName')"
    }
}
