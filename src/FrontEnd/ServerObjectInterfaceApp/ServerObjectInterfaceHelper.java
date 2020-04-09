package FrontEnd.ServerObjectInterfaceApp;


/**
 * ServerObjectInterfaceApp/ServerObjectInterfaceHelper.java .
 * Generated by the IDL-to-Java compiler (portable), version "3.2"
 * from C:/Users/SepJaProROG/StudioProjects/DEMS_Project/src/FrontEnd/ServerObjectInterface.idl
 * Wednesday, April 8, 2020 7:11:05 PM EDT
 */

abstract public class ServerObjectInterfaceHelper {
  private static String _id = "IDL:ServerObjectInterfaceApp/ServerObjectInterface:1.0";
  private static org.omg.CORBA.TypeCode __typeCode = null;

  public static void insert(org.omg.CORBA.Any a, FrontEnd.ServerObjectInterfaceApp.ServerObjectInterface that) {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream();
    a.type(type());
    write(out, that);
    a.read_value(out.create_input_stream(), type());
  }

  public static FrontEnd.ServerObjectInterfaceApp.ServerObjectInterface extract(org.omg.CORBA.Any a) {
    return read(a.create_input_stream());
  }

  synchronized public static org.omg.CORBA.TypeCode type() {
    if (__typeCode == null) {
      __typeCode = org.omg.CORBA.ORB.init().create_interface_tc(FrontEnd.ServerObjectInterfaceApp.ServerObjectInterfaceHelper.id(), "ServerObjectInterface");
    }
    return __typeCode;
  }

  public static String id() {
    return _id;
  }

  public static FrontEnd.ServerObjectInterfaceApp.ServerObjectInterface read(org.omg.CORBA.portable.InputStream istream) {
    return narrow(istream.read_Object(_ServerObjectInterfaceStub.class));
  }

  public static void write(org.omg.CORBA.portable.OutputStream ostream, FrontEnd.ServerObjectInterfaceApp.ServerObjectInterface value) {
    ostream.write_Object(value);
  }

  public static FrontEnd.ServerObjectInterfaceApp.ServerObjectInterface narrow(org.omg.CORBA.Object obj) {
    if (obj == null)
      return null;
    else if (obj instanceof FrontEnd.ServerObjectInterfaceApp.ServerObjectInterface)
      return (FrontEnd.ServerObjectInterfaceApp.ServerObjectInterface) obj;
    else if (!obj._is_a(id()))
      throw new org.omg.CORBA.BAD_PARAM();
    else {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate();
      FrontEnd.ServerObjectInterfaceApp._ServerObjectInterfaceStub stub = new FrontEnd.ServerObjectInterfaceApp._ServerObjectInterfaceStub();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static FrontEnd.ServerObjectInterfaceApp.ServerObjectInterface unchecked_narrow(org.omg.CORBA.Object obj) {
    if (obj == null)
      return null;
    else if (obj instanceof FrontEnd.ServerObjectInterfaceApp.ServerObjectInterface)
      return (FrontEnd.ServerObjectInterfaceApp.ServerObjectInterface) obj;
    else {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate();
      FrontEnd.ServerObjectInterfaceApp._ServerObjectInterfaceStub stub = new FrontEnd.ServerObjectInterfaceApp._ServerObjectInterfaceStub();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}