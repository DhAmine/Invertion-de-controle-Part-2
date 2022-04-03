package dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImpl implements IDao {
    @Override
    public double getData() {
        /* se connecter a la base de donnée pour recup la temp */
        System.out.println("version de base de données");
        double temp=Math.random()*40;
        return temp;
    }
}
