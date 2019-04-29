import java.rmi.*;
public interface RemoteInterface extends Remote
{
//for now, i will take add method as my base method represent RMI
public double add(double x,double y) throws RemoteException;
public double sub(double x,double y) throws RemoteException;
public double mul(double x,double y) throws RemoteException;
public double div(double x,double y) throws RemoteException;
}