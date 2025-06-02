package app;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;
import db.DbException;

public class Transactions {
    public static void main(String[] args) {

        Connection conn = null;
        Statement st = null;

        try {
            conn = DB.getConnection();
            conn.setAutoCommit(false);

            st = conn.createStatement();

            int rows1 = st.executeUpdate(
                    "UPDATE seller "
                            + "SET BaseSalary = 2090 " +
                            "WHERE DepertmentId = 1");

            int rows2 = st.executeUpdate(
                    "UPDATE seller "
                            + "SET BaseSalary = 3090 " +
                            "WHERE DepertmentId = 2");

            conn.commit();
            System.out.println("Rows1: " + rows1);
            System.out.println("Rows2: " + rows2);

        } catch (SQLException e) {
            try {
                conn.rollback();
                throw new DbException("Transaction rolled back by: " + e.getMessage());

            } catch (SQLException e1) {
                throw new DbException("Error trying to roll back by: " + e1.getMessage());

            }
        } finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }
    }
}
