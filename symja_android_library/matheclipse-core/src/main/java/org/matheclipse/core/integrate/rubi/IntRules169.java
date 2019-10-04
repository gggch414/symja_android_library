package org.matheclipse.core.integrate.rubi;


import static org.matheclipse.core.expression.F.*;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.*;
import static org.matheclipse.core.integrate.rubi.UtilityFunctions.*;
import org.matheclipse.core.interfaces.IAST;

/** 
 * IndefiniteIntegrationRules from the <a href="http://www.apmaths.uwo.ca/~arich/">Rubi -
 * rule-based integrator</a>.
 *  
 */
public class IntRules169 { 

	public static void initialize() {
		Initializer.init();
	}

	private static class Initializer  {

		private static void init() {
IIntegrate(4226,Int(Times(u_,Plus(A_,Times(B_DEFAULT,$($s("§sec"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))))),x_Symbol),
    Condition(Int(Times(ActivateTrig(u),Plus(BSymbol,Times(ASymbol,Cos(Plus(a,Times(b,x))))),Power(Cos(Plus(a,Times(b,x))),CN1)),x),And(FreeQ(List(a,b,ASymbol,BSymbol),x),KnownSineIntegrandQ(u,x))));
IIntegrate(4227,Int(Times(Plus(A_DEFAULT,Times($($s("§csc"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))),B_DEFAULT),Times(Sqr($($s("§csc"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),C_DEFAULT)),u_DEFAULT,Power(Times(c_DEFAULT,$($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Dist(Sqr(c),Int(Times(ActivateTrig(u),Power(Times(c,Sin(Plus(a,Times(b,x)))),Subtract(n,C2)),Plus(C,Times(BSymbol,Sin(Plus(a,Times(b,x)))),Times(ASymbol,Sqr(Sin(Plus(a,Times(b,x))))))),x),x),And(FreeQ(List(a,b,c,ASymbol,BSymbol,C,n),x),KnownSineIntegrandQ(u,x))));
IIntegrate(4228,Int(Times(Power(Times($($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))),c_DEFAULT),n_DEFAULT),u_DEFAULT,Plus(A_DEFAULT,Times(B_DEFAULT,$($s("§sec"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),Times(C_DEFAULT,Sqr($($s("§sec"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))))))),x_Symbol),
    Condition(Dist(Sqr(c),Int(Times(ActivateTrig(u),Power(Times(c,Cos(Plus(a,Times(b,x)))),Subtract(n,C2)),Plus(C,Times(BSymbol,Cos(Plus(a,Times(b,x)))),Times(ASymbol,Sqr(Cos(Plus(a,Times(b,x))))))),x),x),And(FreeQ(List(a,b,c,ASymbol,BSymbol,C,n),x),KnownSineIntegrandQ(u,x))));
IIntegrate(4229,Int(Times(u_DEFAULT,Plus(Times(Sqr($($s("§csc"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),C_DEFAULT),A_),Power(Times(c_DEFAULT,$($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Dist(Sqr(c),Int(Times(ActivateTrig(u),Power(Times(c,Sin(Plus(a,Times(b,x)))),Subtract(n,C2)),Plus(C,Times(ASymbol,Sqr(Sin(Plus(a,Times(b,x))))))),x),x),And(FreeQ(List(a,b,c,ASymbol,C,n),x),KnownSineIntegrandQ(u,x))));
IIntegrate(4230,Int(Times(Power(Times($($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))),c_DEFAULT),n_DEFAULT),u_DEFAULT,Plus(A_,Times(C_DEFAULT,Sqr($($s("§sec"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))))))),x_Symbol),
    Condition(Dist(Sqr(c),Int(Times(ActivateTrig(u),Power(Times(c,Cos(Plus(a,Times(b,x)))),Subtract(n,C2)),Plus(C,Times(ASymbol,Sqr(Cos(Plus(a,Times(b,x))))))),x),x),And(FreeQ(List(a,b,c,ASymbol,C,n),x),KnownSineIntegrandQ(u,x))));
IIntegrate(4231,Int(Times(Plus(A_DEFAULT,Times($($s("§csc"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))),B_DEFAULT),Times(Sqr($($s("§csc"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),C_DEFAULT)),u_),x_Symbol),
    Condition(Int(Times(ActivateTrig(u),Plus(C,Times(BSymbol,Sin(Plus(a,Times(b,x)))),Times(ASymbol,Sqr(Sin(Plus(a,Times(b,x)))))),Power(Sin(Plus(a,Times(b,x))),CN2)),x),And(FreeQ(List(a,b,ASymbol,BSymbol,C),x),KnownSineIntegrandQ(u,x))));
IIntegrate(4232,Int(Times(u_,Plus(A_DEFAULT,Times(B_DEFAULT,$($s("§sec"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),Times(C_DEFAULT,Sqr($($s("§sec"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))))))),x_Symbol),
    Condition(Int(Times(ActivateTrig(u),Plus(C,Times(BSymbol,Cos(Plus(a,Times(b,x)))),Times(ASymbol,Sqr(Cos(Plus(a,Times(b,x)))))),Power(Cos(Plus(a,Times(b,x))),CN2)),x),And(FreeQ(List(a,b,ASymbol,BSymbol,C),x),KnownSineIntegrandQ(u,x))));
IIntegrate(4233,Int(Times(Plus(Times(Sqr($($s("§csc"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),C_DEFAULT),A_),u_),x_Symbol),
    Condition(Int(Times(ActivateTrig(u),Plus(C,Times(ASymbol,Sqr(Sin(Plus(a,Times(b,x)))))),Power(Sin(Plus(a,Times(b,x))),CN2)),x),And(FreeQ(List(a,b,ASymbol,C),x),KnownSineIntegrandQ(u,x))));
IIntegrate(4234,Int(Times(u_,Plus(A_,Times(C_DEFAULT,Sqr($($s("§sec"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))))))),x_Symbol),
    Condition(Int(Times(ActivateTrig(u),Plus(C,Times(ASymbol,Sqr(Cos(Plus(a,Times(b,x)))))),Power(Cos(Plus(a,Times(b,x))),CN2)),x),And(FreeQ(List(a,b,ASymbol,C),x),KnownSineIntegrandQ(u,x))));
IIntegrate(4235,Int(Times(u_,Plus(A_DEFAULT,Times($($s("§csc"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))),C_DEFAULT),Times(B_DEFAULT,$($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))))),x_Symbol),
    Condition(Int(Times(ActivateTrig(u),Plus(C,Times(ASymbol,Sin(Plus(a,Times(b,x)))),Times(BSymbol,Sqr(Sin(Plus(a,Times(b,x)))))),Power(Sin(Plus(a,Times(b,x))),CN1)),x),FreeQ(List(a,b,ASymbol,BSymbol,C),x)));
IIntegrate(4236,Int(Times(u_,Plus(A_DEFAULT,Times($($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))),B_DEFAULT),Times(C_DEFAULT,$($s("§sec"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))))),x_Symbol),
    Condition(Int(Times(ActivateTrig(u),Plus(C,Times(ASymbol,Cos(Plus(a,Times(b,x)))),Times(BSymbol,Sqr(Cos(Plus(a,Times(b,x)))))),Power(Cos(Plus(a,Times(b,x))),CN1)),x),FreeQ(List(a,b,ASymbol,BSymbol,C),x)));
IIntegrate(4237,Int(Times(u_,Plus(Times(A_DEFAULT,Power($($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))),n_DEFAULT)),Times(B_DEFAULT,Power($($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))),$p("n1"))),Times(C_DEFAULT,Power($($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))),$p("n2"))))),x_Symbol),
    Condition(Int(Times(ActivateTrig(u),Power(Sin(Plus(a,Times(b,x))),n),Plus(ASymbol,Times(BSymbol,Sin(Plus(a,Times(b,x)))),Times(C,Sqr(Sin(Plus(a,Times(b,x))))))),x),And(FreeQ(List(a,b,ASymbol,BSymbol,C,n),x),EqQ($s("n1"),Plus(n,C1)),EqQ($s("n2"),Plus(n,C2)))));
IIntegrate(4238,Int(Times(Plus(Times(Power($($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))),n_DEFAULT),A_DEFAULT),Times(Power($($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))),$p("n1")),B_DEFAULT),Times(Power($($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))),$p("n2")),C_DEFAULT)),u_),x_Symbol),
    Condition(Int(Times(ActivateTrig(u),Power(Cos(Plus(a,Times(b,x))),n),Plus(ASymbol,Times(BSymbol,Cos(Plus(a,Times(b,x)))),Times(C,Sqr(Cos(Plus(a,Times(b,x))))))),x),And(FreeQ(List(a,b,ASymbol,BSymbol,C,n),x),EqQ($s("n1"),Plus(n,C1)),EqQ($s("n2"),Plus(n,C2)))));
IIntegrate(4239,Int(Times(Power(Times($($s("§cot"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))),c_DEFAULT),m_DEFAULT),u_,Power(Times(d_DEFAULT,$($s("§tan"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(Times(c,Cot(Plus(a,Times(b,x)))),m),Power(Times(d,Tan(Plus(a,Times(b,x)))),m)),Int(Times(ActivateTrig(u),Power(Times(d,Tan(Plus(a,Times(b,x)))),Subtract(n,m))),x),x),And(FreeQ(List(a,b,c,d,m,n),x),KnownTangentIntegrandQ(u,x))));
IIntegrate(4240,Int(Times(Power(Times($($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))),d_DEFAULT),n_DEFAULT),u_,Power(Times(c_DEFAULT,$($s("§tan"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(Times(c,Tan(Plus(a,Times(b,x)))),m),Power(Times(d,Cos(Plus(a,Times(b,x)))),m),Power(Power(Times(d,Sin(Plus(a,Times(b,x)))),m),CN1)),Int(Times(ActivateTrig(u),Power(Times(d,Sin(Plus(a,Times(b,x)))),m),Power(Power(Times(d,Cos(Plus(a,Times(b,x)))),Subtract(m,n)),CN1)),x),x),And(FreeQ(List(a,b,c,d,m,n),x),KnownCotangentIntegrandQ(u,x))));
IIntegrate(4241,Int(Times(Power(Times($($s("§cot"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))),c_DEFAULT),m_DEFAULT),u_),x_Symbol),
    Condition(Dist(Times(Power(Times(c,Cot(Plus(a,Times(b,x)))),m),Power(Times(c,Tan(Plus(a,Times(b,x)))),m)),Int(Times(ActivateTrig(u),Power(Power(Times(c,Tan(Plus(a,Times(b,x)))),m),CN1)),x),x),And(FreeQ(List(a,b,c,m),x),Not(IntegerQ(m)),KnownTangentIntegrandQ(u,x))));
IIntegrate(4242,Int(Times(u_,Power(Times(c_DEFAULT,$($s("§tan"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(Times(c,Cot(Plus(a,Times(b,x)))),m),Power(Times(c,Tan(Plus(a,Times(b,x)))),m)),Int(Times(ActivateTrig(u),Power(Power(Times(c,Cot(Plus(a,Times(b,x)))),m),CN1)),x),x),And(FreeQ(List(a,b,c,m),x),Not(IntegerQ(m)),KnownCotangentIntegrandQ(u,x))));
IIntegrate(4243,Int(Times(Plus(Times($($s("§cot"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))),B_DEFAULT),A_),u_,Power(Times(c_DEFAULT,$($s("§tan"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Dist(c,Int(Times(ActivateTrig(u),Power(Times(c,Tan(Plus(a,Times(b,x)))),Subtract(n,C1)),Plus(BSymbol,Times(ASymbol,Tan(Plus(a,Times(b,x)))))),x),x),And(FreeQ(List(a,b,c,ASymbol,BSymbol,n),x),KnownTangentIntegrandQ(u,x))));
IIntegrate(4244,Int(Times(Power(Times($($s("§cot"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))),c_DEFAULT),n_DEFAULT),u_,Plus(A_,Times(B_DEFAULT,$($s("§tan"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))))),x_Symbol),
    Condition(Dist(c,Int(Times(ActivateTrig(u),Power(Times(c,Cot(Plus(a,Times(b,x)))),Subtract(n,C1)),Plus(BSymbol,Times(ASymbol,Cot(Plus(a,Times(b,x)))))),x),x),And(FreeQ(List(a,b,c,ASymbol,BSymbol,n),x),KnownCotangentIntegrandQ(u,x))));
IIntegrate(4245,Int(Times(Plus(Times($($s("§cot"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))),B_DEFAULT),A_),u_),x_Symbol),
    Condition(Int(Times(ActivateTrig(u),Plus(BSymbol,Times(ASymbol,Tan(Plus(a,Times(b,x))))),Power(Tan(Plus(a,Times(b,x))),CN1)),x),And(FreeQ(List(a,b,ASymbol,BSymbol),x),KnownTangentIntegrandQ(u,x))));
IIntegrate(4246,Int(Times(u_,Plus(A_,Times(B_DEFAULT,$($s("§tan"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))))),x_Symbol),
    Condition(Int(Times(ActivateTrig(u),Plus(BSymbol,Times(ASymbol,Cot(Plus(a,Times(b,x))))),Power(Cot(Plus(a,Times(b,x))),CN1)),x),And(FreeQ(List(a,b,ASymbol,BSymbol),x),KnownCotangentIntegrandQ(u,x))));
IIntegrate(4247,Int(Times(Plus(A_DEFAULT,Times($($s("§cot"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))),B_DEFAULT),Times(Sqr($($s("§cot"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),C_DEFAULT)),u_DEFAULT,Power(Times(c_DEFAULT,$($s("§tan"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Dist(Sqr(c),Int(Times(ActivateTrig(u),Power(Times(c,Tan(Plus(a,Times(b,x)))),Subtract(n,C2)),Plus(C,Times(BSymbol,Tan(Plus(a,Times(b,x)))),Times(ASymbol,Sqr(Tan(Plus(a,Times(b,x))))))),x),x),And(FreeQ(List(a,b,c,ASymbol,BSymbol,C,n),x),KnownTangentIntegrandQ(u,x))));
IIntegrate(4248,Int(Times(Power(Times($($s("§cot"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))),c_DEFAULT),n_DEFAULT),u_DEFAULT,Plus(A_DEFAULT,Times(B_DEFAULT,$($s("§tan"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),Times(C_DEFAULT,Sqr($($s("§tan"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))))))),x_Symbol),
    Condition(Dist(Sqr(c),Int(Times(ActivateTrig(u),Power(Times(c,Cot(Plus(a,Times(b,x)))),Subtract(n,C2)),Plus(C,Times(BSymbol,Cot(Plus(a,Times(b,x)))),Times(ASymbol,Sqr(Cot(Plus(a,Times(b,x))))))),x),x),And(FreeQ(List(a,b,c,ASymbol,BSymbol,C,n),x),KnownCotangentIntegrandQ(u,x))));
IIntegrate(4249,Int(Times(u_DEFAULT,Plus(Times(Sqr($($s("§cot"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),C_DEFAULT),A_),Power(Times(c_DEFAULT,$($s("§tan"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Dist(Sqr(c),Int(Times(ActivateTrig(u),Power(Times(c,Tan(Plus(a,Times(b,x)))),Subtract(n,C2)),Plus(C,Times(ASymbol,Sqr(Tan(Plus(a,Times(b,x))))))),x),x),And(FreeQ(List(a,b,c,ASymbol,C,n),x),KnownTangentIntegrandQ(u,x))));
IIntegrate(4250,Int(Times(Power(Times($($s("§cot"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))),c_DEFAULT),n_DEFAULT),u_DEFAULT,Plus(A_,Times(C_DEFAULT,Sqr($($s("§tan"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))))))),x_Symbol),
    Condition(Dist(Sqr(c),Int(Times(ActivateTrig(u),Power(Times(c,Cot(Plus(a,Times(b,x)))),Subtract(n,C2)),Plus(C,Times(ASymbol,Sqr(Cot(Plus(a,Times(b,x))))))),x),x),And(FreeQ(List(a,b,c,ASymbol,C,n),x),KnownCotangentIntegrandQ(u,x))));
  }
}
}
