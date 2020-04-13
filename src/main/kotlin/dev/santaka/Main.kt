package dev.santaka

import dev.santaka.ticket.CreateATicket
import dev.santaka.ticket.adapter.TicketRepositoryInMemory

fun main() {
    val tickets = TicketRepositoryInMemory()
    val createATicket = CreateATicket(tickets)

    createATicket(1, "this is a ticket")

    val ticket = tickets.find(1)
    println(ticket?.subject)
}
