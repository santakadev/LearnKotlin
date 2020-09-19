package dev.santaka

import java.sql.*
import java.util.*

class ConnectToMySql {

    internal var connection: Connection? = null

    fun connect() {
        val connectionProps = Properties()
        connectionProps.put("user", "root")
        connectionProps.put("password", "password")
        try {
            connection =DriverManager.getConnection(
                    "jdbc:" + "mysql" + "://" +
                            "127.0.0.1" +
                            ":" + "3306" + "/" +
                            "",
                    connectionProps)
        } catch (ex: SQLException) {
            // handle any errors
            ex.printStackTrace()
        } catch (ex: Exception) {
            // handle any errors
            ex.printStackTrace()
        }

        try {
            val stmt: Statement = connection!!.createStatement()
            var resultset: ResultSet = stmt.executeQuery("SHOW DATABASES;")

            if (stmt.execute("SHOW DATABASES;")) {
                resultset = stmt.resultSet
            }

            while (resultset.next()) {
                println(resultset.getString("Database"))
            }
        } catch (ex: SQLException) {
            ex.printStackTrace()
        }
    }
}