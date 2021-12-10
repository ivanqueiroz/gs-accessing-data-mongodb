package dev.ivanqueiroz.gsaccessingdatamongodb

import dev.ivanqueiroz.gsaccessingdatamongodb.model.Customer
import dev.ivanqueiroz.gsaccessingdatamongodb.repository.CustomerRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GsAccessingDataMongodbApplication(val customerRepository: CustomerRepository) : CommandLineRunner {
    override fun run(vararg args: String?) {
        customerRepository.deleteAll()
        customerRepository.save(Customer("Keanu", "Reeves"))
        customerRepository.save(Customer("Laurence", "Fishbourne"))

        println("Customers found with findAll():")
        println("-------------------------------")
        customerRepository.findAll().forEach{ println(it) }
    }
}

fun main(args: Array<String>) {
    runApplication<GsAccessingDataMongodbApplication>(*args)
}
