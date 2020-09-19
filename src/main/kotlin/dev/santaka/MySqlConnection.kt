package dev.santaka

import java.sql.*
import java.util.*

class MySqlConnection {

    private var connection: Connection? = null

    private fun connect() {
        if (connection != null) return

        val connectionProps = Properties()
        connectionProps.put("user", "root")
        connectionProps.put("password", "password")
        try {
            connection =DriverManager.getConnection(
                    "jdbc:" + "mysql" + "://" +
                            "127.0.0.1" +
                            ":" + "3306" + "/" +
                            "kotlin",
                    connectionProps)
        } catch (ex: SQLException) {
            ex.printStackTrace()
        } catch (ex: Exception) {
            ex.printStackTrace()
        }
    }

    fun createStatement(): Statement {
        if (connection == null) {
            this.connect()
        }

        return connection!!.createStatement()
    }
}