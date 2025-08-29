package rmiexample;


import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class SumImpl extends UnicastRemoteObject implements SumInterface {

    protected SumImpl() throws RemoteException {
        super();
    }

    public int add(int a, int b) throws RemoteException {
        return a + b;
    }
}

