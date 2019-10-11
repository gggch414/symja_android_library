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
public class IntRules222 { 

	public static void initialize() {
		Initializer.init();
	}

	private static class Initializer  {

		private static void init() {
IIntegrate(5551,Int(Times(Power(Times(e_DEFAULT,x_),m_DEFAULT),Power(Sech(Times(Plus(a_DEFAULT,Times(Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))),b_DEFAULT)),d_DEFAULT)),p_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(Times(e,x),Plus(m,C1)),Power(Times(e,n,Power(Times(c,Power(x,n)),Times(Plus(m,C1),Power(n,CN1)))),CN1)),Subst(Int(Times(Power(x,Subtract(Times(Plus(m,C1),Power(n,CN1)),C1)),Power(Sech(Times(d,Plus(a,Times(b,Log(x))))),p)),x),x,Times(c,Power(x,n))),x),And(FreeQ(List(a,b,c,d,e,m,n,p),x),Or(NeQ(c,C1),NeQ(n,C1)))));
IIntegrate(5552,Int(Times(Power(Csch(Times(Plus(a_DEFAULT,Times(Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))),b_DEFAULT)),d_DEFAULT)),p_DEFAULT),Power(Times(e_DEFAULT,x_),m_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(Times(e,x),Plus(m,C1)),Power(Times(e,n,Power(Times(c,Power(x,n)),Times(Plus(m,C1),Power(n,CN1)))),CN1)),Subst(Int(Times(Power(x,Subtract(Times(Plus(m,C1),Power(n,CN1)),C1)),Power(Csch(Times(d,Plus(a,Times(b,Log(x))))),p)),x),x,Times(c,Power(x,n))),x),And(FreeQ(List(a,b,c,d,e,m,n,p),x),Or(NeQ(c,C1),NeQ(n,C1)))));
IIntegrate(5553,Int(Times(Log(Times(b_DEFAULT,x_)),Sinh(Times(Log(Times(b_DEFAULT,x_)),a_DEFAULT,x_))),x_Symbol),
    Condition(Subtract(Simp(Times(Cosh(Times(a,x,Log(Times(b,x)))),Power(a,CN1)),x),Int(Sinh(Times(a,x,Log(Times(b,x)))),x)),FreeQ(List(a,b),x)));
IIntegrate(5554,Int(Times(Cosh(Times(Log(Times(b_DEFAULT,x_)),a_DEFAULT,x_)),Log(Times(b_DEFAULT,x_))),x_Symbol),
    Condition(Subtract(Simp(Times(Sinh(Times(a,x,Log(Times(b,x)))),Power(a,CN1)),x),Int(Cosh(Times(a,x,Log(Times(b,x)))),x)),FreeQ(List(a,b),x)));
IIntegrate(5555,Int(Times(Log(Times(b_DEFAULT,x_)),Power(x_,m_DEFAULT),Sinh(Times(Log(Times(b_DEFAULT,x_)),a_DEFAULT,Power(x_,n_DEFAULT)))),x_Symbol),
    Condition(Subtract(Simp(Times(Cosh(Times(a,Power(x,n),Log(Times(b,x)))),Power(Times(a,n),CN1)),x),Dist(Power(n,CN1),Int(Times(Power(x,m),Sinh(Times(a,Power(x,n),Log(Times(b,x))))),x),x)),And(FreeQ(List(a,b,m,n),x),EqQ(m,Subtract(n,C1)))));
IIntegrate(5556,Int(Times(Cosh(Times(Log(Times(b_DEFAULT,x_)),a_DEFAULT,Power(x_,n_DEFAULT))),Log(Times(b_DEFAULT,x_)),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Subtract(Simp(Times(Sinh(Times(a,Power(x,n),Log(Times(b,x)))),Power(Times(a,n),CN1)),x),Dist(Power(n,CN1),Int(Times(Power(x,m),Cosh(Times(a,Power(x,n),Log(Times(b,x))))),x),x)),And(FreeQ(List(a,b,m,n),x),EqQ(m,Subtract(n,C1)))));
IIntegrate(5557,Int(Times(Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),Power(Sinh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),n_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Sinh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),CN1)),x_Symbol),
    Condition(Subtract(Dist(Power(b,CN1),Int(Times(Power(Plus(e,Times(f,x)),m),Power(Sinh(Plus(c,Times(d,x))),Subtract(n,C1))),x),x),Dist(Times(a,Power(b,CN1)),Int(Times(Power(Plus(e,Times(f,x)),m),Power(Sinh(Plus(c,Times(d,x))),Subtract(n,C1)),Power(Plus(a,Times(b,Sinh(Plus(c,Times(d,x))))),CN1)),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(m,C0),IGtQ(n,C0))));
IIntegrate(5558,Int(Times(Power(Cosh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),n_DEFAULT),Power(Plus(Times(Cosh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),b_DEFAULT),a_),CN1),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Subtract(Dist(Power(b,CN1),Int(Times(Power(Plus(e,Times(f,x)),m),Power(Cosh(Plus(c,Times(d,x))),Subtract(n,C1))),x),x),Dist(Times(a,Power(b,CN1)),Int(Times(Power(Plus(e,Times(f,x)),m),Power(Cosh(Plus(c,Times(d,x))),Subtract(n,C1)),Power(Plus(a,Times(b,Cosh(Plus(c,Times(d,x))))),CN1)),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(m,C0),IGtQ(n,C0))));
IIntegrate(5559,Int(Times(Cosh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Sinh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),CN1)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(Plus(e,Times(f,x)),Plus(m,C1)),Power(Times(b,f,Plus(m,C1)),CN1)),x)),Dist(C2,Int(Times(Power(Plus(e,Times(f,x)),m),Exp(Plus(c,Times(d,x))),Power(Plus(a,Times(b,Exp(Plus(c,Times(d,x))))),CN1)),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(m,C0),EqQ(Plus(Sqr(a),Sqr(b)),C0))));
IIntegrate(5560,Int(Times(Power(Plus(Times(Cosh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),b_DEFAULT),a_),CN1),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),Sinh(Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(Plus(e,Times(f,x)),Plus(m,C1)),Power(Times(b,f,Plus(m,C1)),CN1)),x)),Dist(C2,Int(Times(Power(Plus(e,Times(f,x)),m),Exp(Plus(c,Times(d,x))),Power(Plus(a,Times(b,Exp(Plus(c,Times(d,x))))),CN1)),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(m,C0),EqQ(Subtract(Sqr(a),Sqr(b)),C0))));
IIntegrate(5561,Int(Times(Cosh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Sinh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),CN1)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(Plus(e,Times(f,x)),Plus(m,C1)),Power(Times(b,f,Plus(m,C1)),CN1)),x)),Int(Times(Power(Plus(e,Times(f,x)),m),Exp(Plus(c,Times(d,x))),Power(Plus(a,Negate(Rt(Plus(Sqr(a),Sqr(b)),C2)),Times(b,Exp(Plus(c,Times(d,x))))),CN1)),x),Int(Times(Power(Plus(e,Times(f,x)),m),Exp(Plus(c,Times(d,x))),Power(Plus(a,Rt(Plus(Sqr(a),Sqr(b)),C2),Times(b,Exp(Plus(c,Times(d,x))))),CN1)),x)),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(m,C0),NeQ(Plus(Sqr(a),Sqr(b)),C0))));
IIntegrate(5562,Int(Times(Power(Plus(Times(Cosh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),b_DEFAULT),a_),CN1),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),Sinh(Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(Plus(e,Times(f,x)),Plus(m,C1)),Power(Times(b,f,Plus(m,C1)),CN1)),x)),Int(Times(Power(Plus(e,Times(f,x)),m),Exp(Plus(c,Times(d,x))),Power(Plus(a,Negate(Rt(Subtract(Sqr(a),Sqr(b)),C2)),Times(b,Exp(Plus(c,Times(d,x))))),CN1)),x),Int(Times(Power(Plus(e,Times(f,x)),m),Exp(Plus(c,Times(d,x))),Power(Plus(a,Rt(Subtract(Sqr(a),Sqr(b)),C2),Times(b,Exp(Plus(c,Times(d,x))))),CN1)),x)),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(m,C0),NeQ(Subtract(Sqr(a),Sqr(b)),C0))));
IIntegrate(5563,Int(Times(Power(Cosh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),n_),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Sinh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),CN1)),x_Symbol),
    Condition(Plus(Dist(Power(a,CN1),Int(Times(Power(Plus(e,Times(f,x)),m),Power(Cosh(Plus(c,Times(d,x))),Subtract(n,C2))),x),x),Dist(Power(b,CN1),Int(Times(Power(Plus(e,Times(f,x)),m),Power(Cosh(Plus(c,Times(d,x))),Subtract(n,C2)),Sinh(Plus(c,Times(d,x)))),x),x)),And(FreeQ(List(a,b,c,d,e,f,m),x),IGtQ(n,C1),EqQ(Plus(Sqr(a),Sqr(b)),C0))));
IIntegrate(5564,Int(Times(Power(Plus(Times(Cosh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),b_DEFAULT),a_),CN1),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),Power(Sinh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),n_)),x_Symbol),
    Condition(Plus(Negate(Dist(Power(a,CN1),Int(Times(Power(Plus(e,Times(f,x)),m),Power(Sinh(Plus(c,Times(d,x))),Subtract(n,C2))),x),x)),Dist(Power(b,CN1),Int(Times(Power(Plus(e,Times(f,x)),m),Power(Sinh(Plus(c,Times(d,x))),Subtract(n,C2)),Cosh(Plus(c,Times(d,x)))),x),x)),And(FreeQ(List(a,b,c,d,e,f,m),x),IGtQ(n,C1),EqQ(Subtract(Sqr(a),Sqr(b)),C0))));
IIntegrate(5565,Int(Times(Power(Cosh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),n_),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Sinh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),CN1)),x_Symbol),
    Condition(Plus(Negate(Dist(Times(a,Power(b,CN2)),Int(Times(Power(Plus(e,Times(f,x)),m),Power(Cosh(Plus(c,Times(d,x))),Subtract(n,C2))),x),x)),Dist(Power(b,CN1),Int(Times(Power(Plus(e,Times(f,x)),m),Power(Cosh(Plus(c,Times(d,x))),Subtract(n,C2)),Sinh(Plus(c,Times(d,x)))),x),x),Dist(Times(Plus(Sqr(a),Sqr(b)),Power(b,CN2)),Int(Times(Power(Plus(e,Times(f,x)),m),Power(Cosh(Plus(c,Times(d,x))),Subtract(n,C2)),Power(Plus(a,Times(b,Sinh(Plus(c,Times(d,x))))),CN1)),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(n,C1),NeQ(Plus(Sqr(a),Sqr(b)),C0),IGtQ(m,C0))));
IIntegrate(5566,Int(Times(Power(Plus(Times(Cosh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),b_DEFAULT),a_),CN1),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),Power(Sinh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),n_)),x_Symbol),
    Condition(Plus(Negate(Dist(Times(a,Power(b,CN2)),Int(Times(Power(Plus(e,Times(f,x)),m),Power(Sinh(Plus(c,Times(d,x))),Subtract(n,C2))),x),x)),Dist(Power(b,CN1),Int(Times(Power(Plus(e,Times(f,x)),m),Power(Sinh(Plus(c,Times(d,x))),Subtract(n,C2)),Cosh(Plus(c,Times(d,x)))),x),x),Dist(Times(Subtract(Sqr(a),Sqr(b)),Power(b,CN2)),Int(Times(Power(Plus(e,Times(f,x)),m),Power(Sinh(Plus(c,Times(d,x))),Subtract(n,C2)),Power(Plus(a,Times(b,Cosh(Plus(c,Times(d,x))))),CN1)),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(n,C1),NeQ(Subtract(Sqr(a),Sqr(b)),C0),IGtQ(m,C0))));
IIntegrate(5567,Int(Times(Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Sinh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),CN1),Power(Tanh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),n_DEFAULT)),x_Symbol),
    Condition(Subtract(Dist(Power(b,CN1),Int(Times(Power(Plus(e,Times(f,x)),m),Sech(Plus(c,Times(d,x))),Power(Tanh(Plus(c,Times(d,x))),Subtract(n,C1))),x),x),Dist(Times(a,Power(b,CN1)),Int(Times(Power(Plus(e,Times(f,x)),m),Sech(Plus(c,Times(d,x))),Power(Tanh(Plus(c,Times(d,x))),Subtract(n,C1)),Power(Plus(a,Times(b,Sinh(Plus(c,Times(d,x))))),CN1)),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(m,C0),IGtQ(n,C0))));
IIntegrate(5568,Int(Times(Power(Coth(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),n_DEFAULT),Power(Plus(Times(Cosh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),b_DEFAULT),a_),CN1),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Subtract(Dist(Power(b,CN1),Int(Times(Power(Plus(e,Times(f,x)),m),Csch(Plus(c,Times(d,x))),Power(Coth(Plus(c,Times(d,x))),Subtract(n,C1))),x),x),Dist(Times(a,Power(b,CN1)),Int(Times(Power(Plus(e,Times(f,x)),m),Csch(Plus(c,Times(d,x))),Power(Coth(Plus(c,Times(d,x))),Subtract(n,C1)),Power(Plus(a,Times(b,Cosh(Plus(c,Times(d,x))))),CN1)),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(m,C0),IGtQ(n,C0))));
IIntegrate(5569,Int(Times(Power(Coth(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),n_DEFAULT),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Sinh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),CN1)),x_Symbol),
    Condition(Subtract(Dist(Power(a,CN1),Int(Times(Power(Plus(e,Times(f,x)),m),Power(Coth(Plus(c,Times(d,x))),n)),x),x),Dist(Times(b,Power(a,CN1)),Int(Times(Power(Plus(e,Times(f,x)),m),Cosh(Plus(c,Times(d,x))),Power(Coth(Plus(c,Times(d,x))),Subtract(n,C1)),Power(Plus(a,Times(b,Sinh(Plus(c,Times(d,x))))),CN1)),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(m,C0),IGtQ(n,C0))));
IIntegrate(5570,Int(Times(Power(Plus(Times(Cosh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),b_DEFAULT),a_),CN1),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),Power(Tanh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),n_DEFAULT)),x_Symbol),
    Condition(Subtract(Dist(Power(a,CN1),Int(Times(Power(Plus(e,Times(f,x)),m),Power(Tanh(Plus(c,Times(d,x))),n)),x),x),Dist(Times(b,Power(a,CN1)),Int(Times(Power(Plus(e,Times(f,x)),m),Sinh(Plus(c,Times(d,x))),Power(Tanh(Plus(c,Times(d,x))),Subtract(n,C1)),Power(Plus(a,Times(b,Cosh(Plus(c,Times(d,x))))),CN1)),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(m,C0),IGtQ(n,C0))));
IIntegrate(5571,Int(Times(Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),Power(Sech(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),n_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Sinh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),CN1)),x_Symbol),
    Condition(Plus(Dist(Power(a,CN1),Int(Times(Power(Plus(e,Times(f,x)),m),Power(Sech(Plus(c,Times(d,x))),Plus(n,C2))),x),x),Dist(Power(b,CN1),Int(Times(Power(Plus(e,Times(f,x)),m),Power(Sech(Plus(c,Times(d,x))),Plus(n,C1)),Tanh(Plus(c,Times(d,x)))),x),x)),And(FreeQ(List(a,b,c,d,e,f,n),x),IGtQ(m,C0),EqQ(Plus(Sqr(a),Sqr(b)),C0))));
IIntegrate(5572,Int(Times(Power(Csch(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),n_DEFAULT),Power(Plus(Times(Cosh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),b_DEFAULT),a_),CN1),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Plus(Negate(Dist(Power(a,CN1),Int(Times(Power(Plus(e,Times(f,x)),m),Power(Csch(Plus(c,Times(d,x))),Plus(n,C2))),x),x)),Dist(Power(b,CN1),Int(Times(Power(Plus(e,Times(f,x)),m),Power(Csch(Plus(c,Times(d,x))),Plus(n,C1)),Coth(Plus(c,Times(d,x)))),x),x)),And(FreeQ(List(a,b,c,d,e,f,n),x),IGtQ(m,C0),EqQ(Subtract(Sqr(a),Sqr(b)),C0))));
IIntegrate(5573,Int(Times(Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),Power(Sech(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),n_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Sinh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),CN1)),x_Symbol),
    Condition(Plus(Dist(Times(Sqr(b),Power(Plus(Sqr(a),Sqr(b)),CN1)),Int(Times(Power(Plus(e,Times(f,x)),m),Power(Sech(Plus(c,Times(d,x))),Subtract(n,C2)),Power(Plus(a,Times(b,Sinh(Plus(c,Times(d,x))))),CN1)),x),x),Dist(Power(Plus(Sqr(a),Sqr(b)),CN1),Int(Times(Power(Plus(e,Times(f,x)),m),Power(Sech(Plus(c,Times(d,x))),n),Subtract(a,Times(b,Sinh(Plus(c,Times(d,x)))))),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(m,C0),NeQ(Plus(Sqr(a),Sqr(b)),C0),IGtQ(n,C0))));
IIntegrate(5574,Int(Times(Power(Csch(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),n_DEFAULT),Power(Plus(Times(Cosh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),b_DEFAULT),a_),CN1),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Plus(Dist(Times(Sqr(b),Power(Subtract(Sqr(a),Sqr(b)),CN1)),Int(Times(Power(Plus(e,Times(f,x)),m),Power(Csch(Plus(c,Times(d,x))),Subtract(n,C2)),Power(Plus(a,Times(b,Cosh(Plus(c,Times(d,x))))),CN1)),x),x),Dist(Power(Subtract(Sqr(a),Sqr(b)),CN1),Int(Times(Power(Plus(e,Times(f,x)),m),Power(Csch(Plus(c,Times(d,x))),n),Subtract(a,Times(b,Cosh(Plus(c,Times(d,x)))))),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(m,C0),NeQ(Subtract(Sqr(a),Sqr(b)),C0),IGtQ(n,C0))));
IIntegrate(5575,Int(Times(Power(Csch(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),n_DEFAULT),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Sinh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),CN1)),x_Symbol),
    Condition(Subtract(Dist(Power(a,CN1),Int(Times(Power(Plus(e,Times(f,x)),m),Power(Csch(Plus(c,Times(d,x))),n)),x),x),Dist(Times(b,Power(a,CN1)),Int(Times(Power(Plus(e,Times(f,x)),m),Power(Csch(Plus(c,Times(d,x))),Subtract(n,C1)),Power(Plus(a,Times(b,Sinh(Plus(c,Times(d,x))))),CN1)),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(m,C0),IGtQ(n,C0))));
  }
}
}