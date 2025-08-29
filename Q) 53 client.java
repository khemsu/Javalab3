/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rmiexample;

import java.rmi.Naming;

public class Client {
    public static void main(String[] args) {
        try {
            // Lookup remote object
            SumInterface stub = (SumInterface) Naming.lookup("rmi://localhost/SumService");

            int result = stub.add(10, 20);
            System.out.println("Sum = " + result);
        } catch (Exception e) {
            System.out.println("Client Exception: " + e);
        }
    }
}

