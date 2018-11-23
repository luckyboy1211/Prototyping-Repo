/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UtilityHandler;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author glori
 */
public interface UtilityInt extends Remote {
    public void reserveUtility(String i,String j,String h,String k,String l) throws RemoteException;
    public void scheduleReservation(String i) throws RemoteException;
    public UtilityInt getReservation() throws RemoteException;
    public String TestRMI() throws RemoteException;
}
