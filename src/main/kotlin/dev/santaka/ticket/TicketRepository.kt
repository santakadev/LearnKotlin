package dev.santaka.ticket

interface TicketRepository {
    fun save(ticket: Ticket)

    fun find(ticketId: Int): Ticket?
}
