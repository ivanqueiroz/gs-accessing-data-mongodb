package dev.ivanqueiroz.gsaccessingdatamongodb.repository

import dev.ivanqueiroz.gsaccessingdatamongodb.model.Customer
import org.springframework.data.mongodb.repository.MongoRepository

interface CustomerRepository : MongoRepository<Customer, Long?> {
    fun findByFirstName(firsrName: String)
    fun findByLastName(lastName: String)
}
