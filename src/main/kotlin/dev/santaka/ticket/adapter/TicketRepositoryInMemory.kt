package dev.santaka.ticket.adapter

import dev.santaka.ticket.Ticket
import dev.santaka.ticket.TicketRepository

class TicketRepositoryInMemory : TicketRepository {

    private val tickets = mutableMapOf<Int, Ticket>()

    override fun save(ticket: Ticket) {
        tickets[ticket.id] = ticket
    }

    override fun find(ticketId: Int): Ticket? {
        return tickets[ticketId]
    }
}