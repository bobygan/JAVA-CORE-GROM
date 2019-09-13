package lesson11.interfaceexample;

public class OracleDbProvider implements DbProvider {


    @Override
    public void connectToDb() {
    //some logic Oracle
    }

    @Override
    public void disconnectFromDb() {
        //some logic Oracle
    }

    @Override
    public void encryptData() {
          //some logic Oracle
    }
}
