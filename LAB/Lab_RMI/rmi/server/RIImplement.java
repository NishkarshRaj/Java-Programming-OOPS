import java.rmi.*;
import java.rmi.server.*;
public class RIImplement extends UnicastRemoteObject implements RemoteInterface
{
RIImplement() throws RemoteException
{
super();
}
public double add(double x,double y)
{
return x+y;
}
public double sub(double x,double y)
{
return x-y;
}
public double mul(double x,double y)
{
return x*y;
}
public double div(double x,double y)
{
return x/y;
}
}