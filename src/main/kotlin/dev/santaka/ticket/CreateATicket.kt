package dev.santaka.ticket

class CreateATicket(private val tickets: TicketRepository) : (Int, String) -> Unit {
    override fun invoke(id: Int, subject: String) {
        tickets.save(Ticket(id, subject))
    }
}
