/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rmiexample;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface SumInterface extends Remote {
    int add(int a, int b) throws RemoteException;
}
    
