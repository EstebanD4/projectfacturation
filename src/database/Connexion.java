package database;

import java.sql.*;
import java.util.Vector;

public class Connexion
{
    private static Connection instance;
    private static final String URL = "jdbc:mariadb://157.180.74.213:3306/Facturation";
    private static final String USER = "";
    private static final String PASSWORD = "";
    private Connection cn;
    private ResultSet result;
    public Connexion(){}

    public static synchronized Connection getInstance() throws SQLException
    {
        if (instance == null || instance.isClosed())
        {
            instance = DriverManager.getConnection(URL, USER, PASSWORD);
        }
        return instance;
    }

    public void close()
    {
        try
        {
            if (instance != null && !instance.isClosed())
            {
                instance.close();
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void connect()
    {
        try
        {
            cn = Connexion.getInstance();
            System.out.println("Connexion à la base de données réussie !");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public Vector<Vector<String>> sendRequest(String req)
    {
        if (cn != null)
        {
            try
            {
                result = cn.createStatement().executeQuery(req);
                ResultSetMetaData resultMeta = result.getMetaData();
                int numCols = resultMeta.getColumnCount();

                Vector<Vector<String>> resVecTab = new Vector();

                int j = 0;
                while (result.next())
                {
                    Vector<String> resVec = new Vector();
                    for (int i  = 1; i <= numCols; i++)
                    {
                        resVec.add(result.getString(i));
                    }
                    resVecTab.add(resVec);
                    j++;
                }
                return resVecTab;
            }
            catch (SQLException e)
            {
                throw new RuntimeException(e);
            }
        }
        return null;
    }
}
