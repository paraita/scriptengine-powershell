// ------------------------------------------------------------------------------
//  <autogenerated>
//      This code was generated by jni4net. See http://jni4net.sourceforge.net/ 
// 
//      Changes to this file may cause incorrect behavior and will be lost if 
//      the code is regenerated.
//  </autogenerated>
// ------------------------------------------------------------------------------

package system;

@net.sf.jni4net.attributes.ClrType
public class EventArgs extends system.Object {
    
    //<generated-proxy>
    private static system.Type staticType;
    
    protected EventArgs(net.sf.jni4net.inj.INJEnv __env, long __handle) {
            super(__env, __handle);
    }
    
    @net.sf.jni4net.attributes.ClrConstructor("()V")
    public EventArgs() {
            super(((net.sf.jni4net.inj.INJEnv)(null)), 0);
        system.EventArgs.__ctorEventArgs0(this);
    }
    
    @net.sf.jni4net.attributes.ClrMethod("()V")
    private native static void __ctorEventArgs0(net.sf.jni4net.inj.IClrProxy thiz);
    
    public static system.Type typeof() {
        return system.EventArgs.staticType;
    }
    
    private static void InitJNI(net.sf.jni4net.inj.INJEnv env, system.Type staticType) {
        system.EventArgs.staticType = staticType;
    }
    //</generated-proxy>
}
