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
public class IntRules206 { 

	public static void initialize() {
		Initializer.init();
	}

	private static class Initializer  {

		private static void init() {
IIntegrate(5151,Int(Times(ArcTan(Times(c_DEFAULT,x_,Power(Plus(a_DEFAULT,Times(b_DEFAULT,Sqr(x_))),CN1D2))),Power(Times(d_DEFAULT,x_),m_DEFAULT)),x_Symbol),
    Condition(Subtract(Simp(Times(Power(Times(d,x),Plus(m,C1)),ArcTan(Times(c,x,Power(Plus(a,Times(b,Sqr(x))),CN1D2))),Power(Times(d,Plus(m,C1)),CN1)),x),Dist(Times(c,Power(Times(d,Plus(m,C1)),CN1)),Int(Times(Power(Times(d,x),Plus(m,C1)),Power(Plus(a,Times(b,Sqr(x))),CN1D2)),x),x)),And(FreeQ(List(a,b,c,d,m),x),EqQ(Plus(b,Sqr(c)),C0),NeQ(m,CN1))));
IIntegrate(5152,Int(Times(ArcCot(Times(c_DEFAULT,x_,Power(Plus(a_DEFAULT,Times(b_DEFAULT,Sqr(x_))),CN1D2))),Power(Times(d_DEFAULT,x_),m_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Times(d,x),Plus(m,C1)),ArcCot(Times(c,x,Power(Plus(a,Times(b,Sqr(x))),CN1D2))),Power(Times(d,Plus(m,C1)),CN1)),x),Dist(Times(c,Power(Times(d,Plus(m,C1)),CN1)),Int(Times(Power(Times(d,x),Plus(m,C1)),Power(Plus(a,Times(b,Sqr(x))),CN1D2)),x),x)),And(FreeQ(List(a,b,c,d,m),x),EqQ(Plus(b,Sqr(c)),C0),NeQ(m,CN1))));
IIntegrate(5153,Int(Times(Power(ArcTan(Times(c_DEFAULT,x_,Power(Plus(a_DEFAULT,Times(b_DEFAULT,Sqr(x_))),CN1D2))),CN1),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Simp(Times(C1,Log(ArcTan(Times(c,x,Power(Plus(a,Times(b,Sqr(x))),CN1D2)))),Power(c,CN1)),x),And(FreeQ(List(a,b,c),x),EqQ(Plus(b,Sqr(c)),C0))));
IIntegrate(5154,Int(Times(Power(ArcCot(Times(c_DEFAULT,x_,Power(Plus(a_DEFAULT,Times(b_DEFAULT,Sqr(x_))),CN1D2))),CN1),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Negate(Simp(Times(Log(ArcCot(Times(c,x,Power(Plus(a,Times(b,Sqr(x))),CN1D2)))),Power(c,CN1)),x)),And(FreeQ(List(a,b,c),x),EqQ(Plus(b,Sqr(c)),C0))));
IIntegrate(5155,Int(Times(Power(ArcTan(Times(c_DEFAULT,x_,Power(Plus(a_DEFAULT,Times(b_DEFAULT,Sqr(x_))),CN1D2))),m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Simp(Times(Power(ArcTan(Times(c,x,Power(Plus(a,Times(b,Sqr(x))),CN1D2))),Plus(m,C1)),Power(Times(c,Plus(m,C1)),CN1)),x),And(FreeQ(List(a,b,c,m),x),EqQ(Plus(b,Sqr(c)),C0),NeQ(m,CN1))));
IIntegrate(5156,Int(Times(Power(ArcCot(Times(c_DEFAULT,x_,Power(Plus(a_DEFAULT,Times(b_DEFAULT,Sqr(x_))),CN1D2))),m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Negate(Simp(Times(Power(ArcCot(Times(c,x,Power(Plus(a,Times(b,Sqr(x))),CN1D2))),Plus(m,C1)),Power(Times(c,Plus(m,C1)),CN1)),x)),And(FreeQ(List(a,b,c,m),x),EqQ(Plus(b,Sqr(c)),C0),NeQ(m,CN1))));
IIntegrate(5157,Int(Times(Power(ArcTan(Times(c_DEFAULT,x_,Power(Plus(a_DEFAULT,Times(b_DEFAULT,Sqr(x_))),CN1D2))),m_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Dist(Times(Sqrt(Plus(a,Times(b,Sqr(x)))),Power(Plus(d,Times(e,Sqr(x))),CN1D2)),Int(Times(Power(ArcTan(Times(c,x,Power(Plus(a,Times(b,Sqr(x))),CN1D2))),m),Power(Plus(a,Times(b,Sqr(x))),CN1D2)),x),x),And(FreeQ(List(a,b,c,d,e,m),x),EqQ(Plus(b,Sqr(c)),C0),EqQ(Subtract(Times(b,d),Times(a,e)),C0))));
IIntegrate(5158,Int(Times(Power(ArcCot(Times(c_DEFAULT,x_,Power(Plus(a_DEFAULT,Times(b_DEFAULT,Sqr(x_))),CN1D2))),m_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Dist(Times(Sqrt(Plus(a,Times(b,Sqr(x)))),Power(Plus(d,Times(e,Sqr(x))),CN1D2)),Int(Times(Power(ArcCot(Times(c,x,Power(Plus(a,Times(b,Sqr(x))),CN1D2))),m),Power(Plus(a,Times(b,Sqr(x))),CN1D2)),x),x),And(FreeQ(List(a,b,c,d,e,m),x),EqQ(Plus(b,Sqr(c)),C0),EqQ(Subtract(Times(b,d),Times(a,e)),C0))));
IIntegrate(5159,Int(Times(ArcTan(Plus(v_,Times(s_DEFAULT,Sqrt(w_)))),u_DEFAULT),x_Symbol),
    Condition(Plus(Dist(Times(C1D4,Pi,s),Int(u,x),x),Dist(C1D2,Int(Times(u,ArcTan(v)),x),x)),And(EqQ(Sqr(s),C1),EqQ(w,Plus(Sqr(v),C1)))));
IIntegrate(5160,Int(Times(ArcCot(Plus(v_,Times(s_DEFAULT,Sqrt(w_)))),u_DEFAULT),x_Symbol),
    Condition(Subtract(Dist(Times(C1D4,Pi,s),Int(u,x),x),Dist(C1D2,Int(Times(u,ArcTan(v)),x),x)),And(EqQ(Sqr(s),C1),EqQ(w,Plus(Sqr(v),C1)))));
IIntegrate(5161,Int(Times(u_,Power(v_,n_DEFAULT)),x_Symbol),
    Condition(With(List(Set($s("tmp"),InverseFunctionOfLinear(u,x))),Condition(Dist(Times(Power(Times(CN1,Discriminant(v,x),Power(Times(C4,Coefficient(v,x,C2)),CN1)),n),Power(Coefficient(Part($s("tmp"),C1),x,C1),CN1)),Subst(Int(SimplifyIntegrand(Times(SubstForInverseFunction(u,$s("tmp"),x),Power(Sec(x),Times(C2,Plus(n,C1)))),x),x),x,$s("tmp")),x),And(Not(FalseQ($s("tmp"))),EqQ(Head($s("tmp")),ArcTan),EqQ(Plus(Times(Discriminant(v,x),Sqr(Part($s("tmp"),C1))),Sqr(D(v,x))),C0)))),And(QuadraticQ(v,x),ILtQ(n,C0),NegQ(Discriminant(v,x)),MatchQ(u,Condition(Times(r_DEFAULT,Power(f_,w_)),FreeQ(f,x))))));
IIntegrate(5162,Int(Times(u_,Power(v_,n_DEFAULT)),x_Symbol),
    Condition(With(List(Set($s("tmp"),InverseFunctionOfLinear(u,x))),Condition(Negate(Dist(Times(Power(Times(CN1,Discriminant(v,x),Power(Times(C4,Coefficient(v,x,C2)),CN1)),n),Power(Coefficient(Part($s("tmp"),C1),x,C1),CN1)),Subst(Int(SimplifyIntegrand(Times(SubstForInverseFunction(u,$s("tmp"),x),Power(Csc(x),Times(C2,Plus(n,C1)))),x),x),x,$s("tmp")),x)),And(Not(FalseQ($s("tmp"))),EqQ(Head($s("tmp")),ArcCot),EqQ(Plus(Times(Discriminant(v,x),Sqr(Part($s("tmp"),C1))),Sqr(D(v,x))),C0)))),And(QuadraticQ(v,x),ILtQ(n,C0),NegQ(Discriminant(v,x)),MatchQ(u,Condition(Times(r_DEFAULT,Power(f_,w_)),FreeQ(f,x))))));
IIntegrate(5163,Int(ArcTan(Plus(c_DEFAULT,Times(d_DEFAULT,Tan(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))))),x_Symbol),
    Condition(Subtract(Simp(Times(x,ArcTan(Plus(c,Times(d,Tan(Plus(a,Times(b,x))))))),x),Dist(Times(CI,b),Int(Times(x,Power(Plus(c,Times(CI,d),Times(c,Exp(Plus(Times(C2,CI,a),Times(C2,CI,b,x))))),CN1)),x),x)),And(FreeQ(List(a,b,c,d),x),EqQ(Sqr(Plus(c,Times(CI,d))),CN1))));
IIntegrate(5164,Int(ArcCot(Plus(c_DEFAULT,Times(d_DEFAULT,Tan(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))))),x_Symbol),
    Condition(Plus(Simp(Times(x,ArcCot(Plus(c,Times(d,Tan(Plus(a,Times(b,x))))))),x),Dist(Times(CI,b),Int(Times(x,Power(Plus(c,Times(CI,d),Times(c,Exp(Plus(Times(C2,CI,a),Times(C2,CI,b,x))))),CN1)),x),x)),And(FreeQ(List(a,b,c,d),x),EqQ(Sqr(Plus(c,Times(CI,d))),CN1))));
IIntegrate(5165,Int(ArcTan(Plus(c_DEFAULT,Times(Cot(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),d_DEFAULT))),x_Symbol),
    Condition(Subtract(Simp(Times(x,ArcTan(Plus(c,Times(d,Cot(Plus(a,Times(b,x))))))),x),Dist(Times(CI,b),Int(Times(x,Power(Subtract(Subtract(c,Times(CI,d)),Times(c,Exp(Plus(Times(C2,CI,a),Times(C2,CI,b,x))))),CN1)),x),x)),And(FreeQ(List(a,b,c,d),x),EqQ(Sqr(Subtract(c,Times(CI,d))),CN1))));
IIntegrate(5166,Int(ArcCot(Plus(c_DEFAULT,Times(Cot(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),d_DEFAULT))),x_Symbol),
    Condition(Plus(Simp(Times(x,ArcCot(Plus(c,Times(d,Cot(Plus(a,Times(b,x))))))),x),Dist(Times(CI,b),Int(Times(x,Power(Subtract(Subtract(c,Times(CI,d)),Times(c,Exp(Plus(Times(C2,CI,a),Times(C2,CI,b,x))))),CN1)),x),x)),And(FreeQ(List(a,b,c,d),x),EqQ(Sqr(Subtract(c,Times(CI,d))),CN1))));
IIntegrate(5167,Int(ArcTan(Plus(c_DEFAULT,Times(d_DEFAULT,Tan(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))))),x_Symbol),
    Condition(Plus(Simp(Times(x,ArcTan(Plus(c,Times(d,Tan(Plus(a,Times(b,x))))))),x),Dist(Times(b,Subtract(Subtract(C1,Times(CI,c)),d)),Int(Times(x,Exp(Plus(Times(C2,CI,a),Times(C2,CI,b,x))),Power(Plus(C1,Times(CN1,CI,c),d,Times(Subtract(Subtract(C1,Times(CI,c)),d),Exp(Plus(Times(C2,CI,a),Times(C2,CI,b,x))))),CN1)),x),x),Negate(Dist(Times(b,Plus(C1,Times(CI,c),d)),Int(Times(x,Exp(Plus(Times(C2,CI,a),Times(C2,CI,b,x))),Power(Plus(C1,Times(CI,c),Negate(d),Times(Plus(C1,Times(CI,c),d),Exp(Plus(Times(C2,CI,a),Times(C2,CI,b,x))))),CN1)),x),x))),And(FreeQ(List(a,b,c,d),x),NeQ(Sqr(Plus(c,Times(CI,d))),CN1))));
IIntegrate(5168,Int(ArcCot(Plus(c_DEFAULT,Times(d_DEFAULT,Tan(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))))),x_Symbol),
    Condition(Plus(Simp(Times(x,ArcCot(Plus(c,Times(d,Tan(Plus(a,Times(b,x))))))),x),Negate(Dist(Times(b,Subtract(Subtract(C1,Times(CI,c)),d)),Int(Times(x,Exp(Plus(Times(C2,CI,a),Times(C2,CI,b,x))),Power(Plus(C1,Times(CN1,CI,c),d,Times(Subtract(Subtract(C1,Times(CI,c)),d),Exp(Plus(Times(C2,CI,a),Times(C2,CI,b,x))))),CN1)),x),x)),Dist(Times(b,Plus(C1,Times(CI,c),d)),Int(Times(x,Exp(Plus(Times(C2,CI,a),Times(C2,CI,b,x))),Power(Plus(C1,Times(CI,c),Negate(d),Times(Plus(C1,Times(CI,c),d),Exp(Plus(Times(C2,CI,a),Times(C2,CI,b,x))))),CN1)),x),x)),And(FreeQ(List(a,b,c,d),x),NeQ(Sqr(Plus(c,Times(CI,d))),CN1))));
IIntegrate(5169,Int(ArcTan(Plus(c_DEFAULT,Times(Cot(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),d_DEFAULT))),x_Symbol),
    Condition(Plus(Simp(Times(x,ArcTan(Plus(c,Times(d,Cot(Plus(a,Times(b,x))))))),x),Dist(Times(b,Subtract(Plus(C1,Times(CI,c)),d)),Int(Times(x,Exp(Plus(Times(C2,CI,a),Times(C2,CI,b,x))),Power(Subtract(Plus(C1,Times(CI,c),d),Times(Subtract(Plus(C1,Times(CI,c)),d),Exp(Plus(Times(C2,CI,a),Times(C2,CI,b,x))))),CN1)),x),x),Negate(Dist(Times(b,Plus(C1,Times(CN1,CI,c),d)),Int(Times(x,Exp(Plus(Times(C2,CI,a),Times(C2,CI,b,x))),Power(Subtract(Subtract(Subtract(C1,Times(CI,c)),d),Times(Plus(C1,Times(CN1,CI,c),d),Exp(Plus(Times(C2,CI,a),Times(C2,CI,b,x))))),CN1)),x),x))),And(FreeQ(List(a,b,c,d),x),NeQ(Sqr(Plus(c,Times(CI,d))),CN1))));
IIntegrate(5170,Int(ArcCot(Plus(c_DEFAULT,Times(Cot(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),d_DEFAULT))),x_Symbol),
    Condition(Plus(Simp(Times(x,ArcCot(Plus(c,Times(d,Cot(Plus(a,Times(b,x))))))),x),Negate(Dist(Times(b,Subtract(Plus(C1,Times(CI,c)),d)),Int(Times(x,Exp(Plus(Times(C2,CI,a),Times(C2,CI,b,x))),Power(Subtract(Plus(C1,Times(CI,c),d),Times(Subtract(Plus(C1,Times(CI,c)),d),Exp(Plus(Times(C2,CI,a),Times(C2,CI,b,x))))),CN1)),x),x)),Dist(Times(b,Plus(C1,Times(CN1,CI,c),d)),Int(Times(x,Exp(Plus(Times(C2,CI,a),Times(C2,CI,b,x))),Power(Subtract(Subtract(Subtract(C1,Times(CI,c)),d),Times(Plus(C1,Times(CN1,CI,c),d),Exp(Plus(Times(C2,CI,a),Times(C2,CI,b,x))))),CN1)),x),x)),And(FreeQ(List(a,b,c,d),x),NeQ(Sqr(Subtract(c,Times(CI,d))),CN1))));
IIntegrate(5171,Int(Times(ArcTan(Plus(c_DEFAULT,Times(d_DEFAULT,Tan(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))))),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Subtract(Simp(Times(Power(Plus(e,Times(f,x)),Plus(m,C1)),ArcTan(Plus(c,Times(d,Tan(Plus(a,Times(b,x)))))),Power(Times(f,Plus(m,C1)),CN1)),x),Dist(Times(CI,b,Power(Times(f,Plus(m,C1)),CN1)),Int(Times(Power(Plus(e,Times(f,x)),Plus(m,C1)),Power(Plus(c,Times(CI,d),Times(c,Exp(Plus(Times(C2,CI,a),Times(C2,CI,b,x))))),CN1)),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(m,C0),EqQ(Sqr(Plus(c,Times(CI,d))),CN1))));
IIntegrate(5172,Int(Times(ArcCot(Plus(c_DEFAULT,Times(d_DEFAULT,Tan(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))))),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(e,Times(f,x)),Plus(m,C1)),ArcCot(Plus(c,Times(d,Tan(Plus(a,Times(b,x)))))),Power(Times(f,Plus(m,C1)),CN1)),x),Dist(Times(CI,b,Power(Times(f,Plus(m,C1)),CN1)),Int(Times(Power(Plus(e,Times(f,x)),Plus(m,C1)),Power(Plus(c,Times(CI,d),Times(c,Exp(Plus(Times(C2,CI,a),Times(C2,CI,b,x))))),CN1)),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(m,C0),EqQ(Sqr(Plus(c,Times(CI,d))),CN1))));
IIntegrate(5173,Int(Times(ArcTan(Plus(c_DEFAULT,Times(Cot(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),d_DEFAULT))),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Subtract(Simp(Times(Power(Plus(e,Times(f,x)),Plus(m,C1)),ArcTan(Plus(c,Times(d,Cot(Plus(a,Times(b,x)))))),Power(Times(f,Plus(m,C1)),CN1)),x),Dist(Times(CI,b,Power(Times(f,Plus(m,C1)),CN1)),Int(Times(Power(Plus(e,Times(f,x)),Plus(m,C1)),Power(Subtract(Subtract(c,Times(CI,d)),Times(c,Exp(Plus(Times(C2,CI,a),Times(C2,CI,b,x))))),CN1)),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(m,C0),EqQ(Sqr(Subtract(c,Times(CI,d))),CN1))));
IIntegrate(5174,Int(Times(ArcCot(Plus(c_DEFAULT,Times(Cot(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),d_DEFAULT))),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(e,Times(f,x)),Plus(m,C1)),ArcCot(Plus(c,Times(d,Cot(Plus(a,Times(b,x)))))),Power(Times(f,Plus(m,C1)),CN1)),x),Dist(Times(CI,b,Power(Times(f,Plus(m,C1)),CN1)),Int(Times(Power(Plus(e,Times(f,x)),Plus(m,C1)),Power(Subtract(Subtract(c,Times(CI,d)),Times(c,Exp(Plus(Times(C2,CI,a),Times(C2,CI,b,x))))),CN1)),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(m,C0),EqQ(Sqr(Subtract(c,Times(CI,d))),CN1))));
IIntegrate(5175,Int(Times(ArcTan(Plus(c_DEFAULT,Times(d_DEFAULT,Tan(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))))),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(e,Times(f,x)),Plus(m,C1)),ArcTan(Plus(c,Times(d,Tan(Plus(a,Times(b,x)))))),Power(Times(f,Plus(m,C1)),CN1)),x),Dist(Times(b,Subtract(Subtract(C1,Times(CI,c)),d),Power(Times(f,Plus(m,C1)),CN1)),Int(Times(Power(Plus(e,Times(f,x)),Plus(m,C1)),Exp(Plus(Times(C2,CI,a),Times(C2,CI,b,x))),Power(Plus(C1,Times(CN1,CI,c),d,Times(Subtract(Subtract(C1,Times(CI,c)),d),Exp(Plus(Times(C2,CI,a),Times(C2,CI,b,x))))),CN1)),x),x),Negate(Dist(Times(b,Plus(C1,Times(CI,c),d),Power(Times(f,Plus(m,C1)),CN1)),Int(Times(Power(Plus(e,Times(f,x)),Plus(m,C1)),Exp(Plus(Times(C2,CI,a),Times(C2,CI,b,x))),Power(Plus(C1,Times(CI,c),Negate(d),Times(Plus(C1,Times(CI,c),d),Exp(Plus(Times(C2,CI,a),Times(C2,CI,b,x))))),CN1)),x),x))),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(m,C0),NeQ(Sqr(Plus(c,Times(CI,d))),CN1))));
  }
}
}
