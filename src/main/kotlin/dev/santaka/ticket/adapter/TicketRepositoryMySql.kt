package dev.santaka.ticket.adapter

import dev.santaka.MySqlConnection
import dev.santaka.ticket.Ticket
import dev.santaka.ticket.TicketRepository
import java.sql.ResultSet
import java.sql.Statement

class TicketRepositoryMySql(private val connection: MySqlConnection) : TicketRepository {

    override fun save(ticket: Ticket) {
        val statement: Statement = connection.createStatement()
        statement.execute("INSERT INTO tickets VALUES (${ticket.id}, '${ticket.subject}')")
    }

    override fun find(ticketId: Int): Ticket? {
        val statement: Statement = connection.createStatement()
        val resultSet: ResultSet = statement.executeQuery("SELECT * FROM tickets WHERE id = $ticketId")

        resultSet.next()

        return Ticket(
                resultSet.getInt("id"),
                resultSet.getString("subject")
        )
    }
}