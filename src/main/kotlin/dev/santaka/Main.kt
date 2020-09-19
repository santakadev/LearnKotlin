package dev.santaka

import dev.santaka.ticket.CreateATicket
import dev.santaka.ticket.adapter.TicketRepositoryMySql

fun main() {
    val connection = MySqlConnection()
    val tickets = TicketRepositoryMySql(connection)
    val createATicket = CreateATicket(tickets)

    createATicket(1, "this is a ticket")

    val ticket = tickets.find(1)
    println(ticket?.subject)

}
