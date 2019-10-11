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
public class IntRules167 { 

	public static void initialize() {
		Initializer.init();
	}

	private static class Initializer  {

		private static void init() {
IIntegrate(4176,Int(Times(Plus(A_,Times(B_DEFAULT,$($s("§sec"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))))),Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§sec"),Plus(d_DEFAULT,Times(e_DEFAULT,x_)))),Times(c_DEFAULT,Sqr($($s("§sec"),Plus(d_DEFAULT,Times(e_DEFAULT,x_)))))),CN1)),x_Symbol),
    Condition(Module(List(Set(q,Rt(Subtract(Sqr(b),Times(C4,a,c)),C2))),Plus(Dist(Plus(BSymbol,Times(Subtract(Times(b,BSymbol),Times(C2,ASymbol,c)),Power(q,CN1))),Int(Power(Plus(b,q,Times(C2,c,Sec(Plus(d,Times(e,x))))),CN1),x),x),Dist(Subtract(BSymbol,Times(Subtract(Times(b,BSymbol),Times(C2,ASymbol,c)),Power(q,CN1))),Int(Power(Plus(b,Negate(q),Times(C2,c,Sec(Plus(d,Times(e,x))))),CN1),x),x))),And(FreeQ(List(a,b,c,d,e,ASymbol,BSymbol),x),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0))));
IIntegrate(4177,Int(Times(Power(Plus(a_DEFAULT,Times($($s("§csc"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),b_DEFAULT),Times(Sqr($($s("§csc"),Plus(d_DEFAULT,Times(e_DEFAULT,x_)))),c_DEFAULT)),CN1),Plus(Times($($s("§csc"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),B_DEFAULT),A_)),x_Symbol),
    Condition(Module(List(Set(q,Rt(Subtract(Sqr(b),Times(C4,a,c)),C2))),Plus(Dist(Plus(BSymbol,Times(Subtract(Times(b,BSymbol),Times(C2,ASymbol,c)),Power(q,CN1))),Int(Power(Plus(b,q,Times(C2,c,Csc(Plus(d,Times(e,x))))),CN1),x),x),Dist(Subtract(BSymbol,Times(Subtract(Times(b,BSymbol),Times(C2,ASymbol,c)),Power(q,CN1))),Int(Power(Plus(b,Negate(q),Times(C2,c,Csc(Plus(d,Times(e,x))))),CN1),x),x))),And(FreeQ(List(a,b,c,d,e,ASymbol,BSymbol),x),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0))));
IIntegrate(4178,Int(Times(Plus(A_,Times(B_DEFAULT,$($s("§sec"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))))),Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§sec"),Plus(d_DEFAULT,Times(e_DEFAULT,x_)))),Times(c_DEFAULT,Sqr($($s("§sec"),Plus(d_DEFAULT,Times(e_DEFAULT,x_)))))),n_)),x_Symbol),
    Condition(Int(ExpandTrig(Times(Plus(ASymbol,Times(BSymbol,$($s("§sec"),Plus(d,Times(e,x))))),Power(Plus(a,Times(b,$($s("§sec"),Plus(d,Times(e,x)))),Times(c,Sqr($($s("§sec"),Plus(d,Times(e,x)))))),n)),x),x),And(FreeQ(List(a,b,c,d,e,ASymbol,BSymbol),x),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),IntegerQ(n))));
IIntegrate(4179,Int(Times(Power(Plus(a_DEFAULT,Times($($s("§csc"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),b_DEFAULT),Times(Sqr($($s("§csc"),Plus(d_DEFAULT,Times(e_DEFAULT,x_)))),c_DEFAULT)),n_),Plus(Times($($s("§csc"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),B_DEFAULT),A_)),x_Symbol),
    Condition(Int(ExpandTrig(Times(Plus(ASymbol,Times(BSymbol,$($s("§csc"),Plus(d,Times(e,x))))),Power(Plus(a,Times(b,$($s("§csc"),Plus(d,Times(e,x)))),Times(c,Sqr($($s("§csc"),Plus(d,Times(e,x)))))),n)),x),x),And(FreeQ(List(a,b,c,d,e,ASymbol,BSymbol),x),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),IntegerQ(n))));
IIntegrate(4180,Int(Times($($s("§csc"),Plus(e_DEFAULT,Times(Pi,k_DEFAULT),Times(Complex(C0,$p("fz")),f_DEFAULT,x_))),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(CN2,Power(Plus(c,Times(d,x)),m),ArcTanh(Times(Exp(Plus(Times(CN1,CI,e),Times(f,$s("fz"),x))),Power(Exp(Times(CI,k,Pi)),CN1))),Power(Times(f,$s("fz"),CI),CN1)),x),Negate(Dist(Times(d,m,Power(Times(f,$s("fz"),CI),CN1)),Int(Times(Power(Plus(c,Times(d,x)),Subtract(m,C1)),Log(Subtract(C1,Times(Exp(Plus(Times(CN1,CI,e),Times(f,$s("fz"),x))),Power(Exp(Times(CI,k,Pi)),CN1))))),x),x)),Dist(Times(d,m,Power(Times(f,$s("fz"),CI),CN1)),Int(Times(Power(Plus(c,Times(d,x)),Subtract(m,C1)),Log(Plus(C1,Times(Exp(Plus(Times(CN1,CI,e),Times(f,$s("fz"),x))),Power(Exp(Times(CI,k,Pi)),CN1))))),x),x)),And(FreeQ(List(c,d,e,f,$s("fz")),x),IntegerQ(Times(C2,k)),IGtQ(m,C0))));
IIntegrate(4181,Int(Times($($s("§csc"),Plus(e_DEFAULT,Times(Pi,k_DEFAULT),Times(f_DEFAULT,x_))),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(CN2,Power(Plus(c,Times(d,x)),m),ArcTanh(Times(Exp(Times(CI,k,Pi)),Exp(Times(CI,Plus(e,Times(f,x)))))),Power(f,CN1)),x),Negate(Dist(Times(d,m,Power(f,CN1)),Int(Times(Power(Plus(c,Times(d,x)),Subtract(m,C1)),Log(Subtract(C1,Times(Exp(Times(CI,k,Pi)),Exp(Times(CI,Plus(e,Times(f,x)))))))),x),x)),Dist(Times(d,m,Power(f,CN1)),Int(Times(Power(Plus(c,Times(d,x)),Subtract(m,C1)),Log(Plus(C1,Times(Exp(Times(CI,k,Pi)),Exp(Times(CI,Plus(e,Times(f,x)))))))),x),x)),And(FreeQ(List(c,d,e,f),x),IntegerQ(Times(C2,k)),IGtQ(m,C0))));
IIntegrate(4182,Int(Times($($s("§csc"),Plus(e_DEFAULT,Times(Complex(C0,$p("fz")),f_DEFAULT,x_))),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(CN2,Power(Plus(c,Times(d,x)),m),ArcTanh(Exp(Plus(Times(CN1,CI,e),Times(f,$s("fz"),x)))),Power(Times(f,$s("fz"),CI),CN1)),x),Negate(Dist(Times(d,m,Power(Times(f,$s("fz"),CI),CN1)),Int(Times(Power(Plus(c,Times(d,x)),Subtract(m,C1)),Log(Subtract(C1,Exp(Plus(Times(CN1,CI,e),Times(f,$s("fz"),x)))))),x),x)),Dist(Times(d,m,Power(Times(f,$s("fz"),CI),CN1)),Int(Times(Power(Plus(c,Times(d,x)),Subtract(m,C1)),Log(Plus(C1,Exp(Plus(Times(CN1,CI,e),Times(f,$s("fz"),x)))))),x),x)),And(FreeQ(List(c,d,e,f,$s("fz")),x),IGtQ(m,C0))));
IIntegrate(4183,Int(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(CN2,Power(Plus(c,Times(d,x)),m),ArcTanh(Exp(Times(CI,Plus(e,Times(f,x))))),Power(f,CN1)),x),Negate(Dist(Times(d,m,Power(f,CN1)),Int(Times(Power(Plus(c,Times(d,x)),Subtract(m,C1)),Log(Subtract(C1,Exp(Times(CI,Plus(e,Times(f,x))))))),x),x)),Dist(Times(d,m,Power(f,CN1)),Int(Times(Power(Plus(c,Times(d,x)),Subtract(m,C1)),Log(Plus(C1,Exp(Times(CI,Plus(e,Times(f,x))))))),x),x)),And(FreeQ(List(c,d,e,f),x),IGtQ(m,C0))));
IIntegrate(4184,Int(Times(Sqr($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(Plus(c,Times(d,x)),m),Cot(Plus(e,Times(f,x))),Power(f,CN1)),x)),Dist(Times(d,m,Power(f,CN1)),Int(Times(Power(Plus(c,Times(d,x)),Subtract(m,C1)),Cot(Plus(e,Times(f,x)))),x),x)),And(FreeQ(List(c,d,e,f),x),GtQ(m,C0))));
IIntegrate(4185,Int(Times(Power(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),n_),Plus(c_DEFAULT,Times(d_DEFAULT,x_))),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Sqr(b),Plus(c,Times(d,x)),Cot(Plus(e,Times(f,x))),Power(Times(b,Csc(Plus(e,Times(f,x)))),Subtract(n,C2)),Power(Times(f,Subtract(n,C1)),CN1)),x)),Dist(Times(Sqr(b),Subtract(n,C2),Power(Subtract(n,C1),CN1)),Int(Times(Plus(c,Times(d,x)),Power(Times(b,Csc(Plus(e,Times(f,x)))),Subtract(n,C2))),x),x),Negate(Simp(Times(Sqr(b),d,Power(Times(b,Csc(Plus(e,Times(f,x)))),Subtract(n,C2)),Power(Times(Sqr(f),Subtract(n,C1),Subtract(n,C2)),CN1)),x))),And(FreeQ(List(b,c,d,e,f),x),GtQ(n,C1),NeQ(n,C2))));
IIntegrate(4186,Int(Times(Power(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),n_),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Sqr(b),Power(Plus(c,Times(d,x)),m),Cot(Plus(e,Times(f,x))),Power(Times(b,Csc(Plus(e,Times(f,x)))),Subtract(n,C2)),Power(Times(f,Subtract(n,C1)),CN1)),x)),Dist(Times(Sqr(b),Sqr(d),m,Subtract(m,C1),Power(Times(Sqr(f),Subtract(n,C1),Subtract(n,C2)),CN1)),Int(Times(Power(Plus(c,Times(d,x)),Subtract(m,C2)),Power(Times(b,Csc(Plus(e,Times(f,x)))),Subtract(n,C2))),x),x),Dist(Times(Sqr(b),Subtract(n,C2),Power(Subtract(n,C1),CN1)),Int(Times(Power(Plus(c,Times(d,x)),m),Power(Times(b,Csc(Plus(e,Times(f,x)))),Subtract(n,C2))),x),x),Negate(Simp(Times(Sqr(b),d,m,Power(Plus(c,Times(d,x)),Subtract(m,C1)),Power(Times(b,Csc(Plus(e,Times(f,x)))),Subtract(n,C2)),Power(Times(Sqr(f),Subtract(n,C1),Subtract(n,C2)),CN1)),x))),And(FreeQ(List(b,c,d,e,f),x),GtQ(n,C1),NeQ(n,C2),GtQ(m,C1))));
IIntegrate(4187,Int(Times(Power(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),n_),Plus(c_DEFAULT,Times(d_DEFAULT,x_))),x_Symbol),
    Condition(Plus(Simp(Times(d,Power(Times(b,Csc(Plus(e,Times(f,x)))),n),Power(Times(Sqr(f),Sqr(n)),CN1)),x),Dist(Times(Plus(n,C1),Power(Times(Sqr(b),n),CN1)),Int(Times(Plus(c,Times(d,x)),Power(Times(b,Csc(Plus(e,Times(f,x)))),Plus(n,C2))),x),x),Simp(Times(Plus(c,Times(d,x)),Cos(Plus(e,Times(f,x))),Power(Times(b,Csc(Plus(e,Times(f,x)))),Plus(n,C1)),Power(Times(b,f,n),CN1)),x)),And(FreeQ(List(b,c,d,e,f),x),LtQ(n,CN1))));
IIntegrate(4188,Int(Times(Power(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),n_),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_)),x_Symbol),
    Condition(Plus(Simp(Times(d,m,Power(Plus(c,Times(d,x)),Subtract(m,C1)),Power(Times(b,Csc(Plus(e,Times(f,x)))),n),Power(Times(Sqr(f),Sqr(n)),CN1)),x),Dist(Times(Plus(n,C1),Power(Times(Sqr(b),n),CN1)),Int(Times(Power(Plus(c,Times(d,x)),m),Power(Times(b,Csc(Plus(e,Times(f,x)))),Plus(n,C2))),x),x),Negate(Dist(Times(Sqr(d),m,Subtract(m,C1),Power(Times(Sqr(f),Sqr(n)),CN1)),Int(Times(Power(Plus(c,Times(d,x)),Subtract(m,C2)),Power(Times(b,Csc(Plus(e,Times(f,x)))),n)),x),x)),Simp(Times(Power(Plus(c,Times(d,x)),m),Cos(Plus(e,Times(f,x))),Power(Times(b,Csc(Plus(e,Times(f,x)))),Plus(n,C1)),Power(Times(b,f,n),CN1)),x)),And(FreeQ(List(b,c,d,e,f),x),LtQ(n,CN1),GtQ(m,C1))));
IIntegrate(4189,Int(Times(Power(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),n_),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(Times(b,Sin(Plus(e,Times(f,x)))),n),Power(Times(b,Csc(Plus(e,Times(f,x)))),n)),Int(Times(Power(Plus(c,Times(d,x)),m),Power(Power(Times(b,Sin(Plus(e,Times(f,x)))),n),CN1)),x),x),And(FreeQ(List(b,c,d,e,f,m,n),x),Not(IntegerQ(n)))));
IIntegrate(4190,Int(Times(Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),n_DEFAULT),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Power(Plus(c,Times(d,x)),m),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),n),x),x),And(FreeQ(List(a,b,c,d,e,f,m),x),IGtQ(m,C0),IGtQ(n,C0))));
IIntegrate(4191,Int(Times(Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),n_DEFAULT),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Power(Plus(c,Times(d,x)),m),Power(Times(Power(Sin(Plus(e,Times(f,x))),n),Power(Power(Plus(b,Times(a,Sin(Plus(e,Times(f,x))))),n),CN1)),CN1),x),x),And(FreeQ(List(a,b,c,d,e,f),x),ILtQ(n,C0),IGtQ(m,C0))));
IIntegrate(4192,Int(Times(Power($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),n_DEFAULT),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Simp(If(MatchQ(f,Times($p("f1",true),Complex(C0,j_))),If(MatchQ(e,Plus($p("e1",true),CPiHalf)),Unintegrable(Times(Power(Plus(c,Times(d,x)),m),Power(Sech(Plus(Times(CI,Subtract(e,CPiHalf)),Times(CI,f,x))),n)),x),Times(Power(CNI,n),Unintegrable(Times(Power(Plus(c,Times(d,x)),m),Power(Csch(Subtract(Times(CN1,CI,e),Times(CI,f,x))),n)),x))),If(MatchQ(e,Plus($p("e1",true),CPiHalf)),Unintegrable(Times(Power(Plus(c,Times(d,x)),m),Power(Sec(Plus(e,Times(CN1,C1D2,Pi),Times(f,x))),n)),x),Unintegrable(Times(Power(Plus(c,Times(d,x)),m),Power(Csc(Plus(e,Times(f,x))),n)),x))),x),And(FreeQ(List(c,d,e,f,m,n),x),IntegerQ(n))));
IIntegrate(4193,Int(Times(Power(Plus(a_DEFAULT,Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT)),n_DEFAULT),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Unintegrable(Times(Power(Plus(c,Times(d,x)),m),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),n)),x),FreeQ(List(a,b,c,d,e,f,m,n),x)));
IIntegrate(4194,Int(Times(Power(u_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Sec(v_))),n_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(ExpandToSum(u,x),m),Power(Plus(a,Times(b,Sec(ExpandToSum(v,x)))),n)),x),And(FreeQ(List(a,b,m,n),x),LinearQ(List(u,v),x),Not(LinearMatchQ(List(u,v),x)))));
IIntegrate(4195,Int(Times(Power(Plus(a_DEFAULT,Times(Csc(v_),b_DEFAULT)),n_DEFAULT),Power(u_,m_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(ExpandToSum(u,x),m),Power(Plus(a,Times(b,Csc(ExpandToSum(v,x)))),n)),x),And(FreeQ(List(a,b,m,n),x),LinearQ(List(u,v),x),Not(LinearMatchQ(List(u,v),x)))));
IIntegrate(4196,Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Sec(Plus(c_DEFAULT,Times(d_DEFAULT,Power(x_,n_)))))),p_DEFAULT),x_Symbol),
    Condition(Dist(Power(n,CN1),Subst(Int(Times(Power(x,Subtract(Power(n,CN1),C1)),Power(Plus(a,Times(b,Sec(Plus(c,Times(d,x))))),p)),x),x,Power(x,n)),x),And(FreeQ(List(a,b,c,d,p),x),IGtQ(Power(n,CN1),C0),IntegerQ(p))));
IIntegrate(4197,Int(Power(Plus(a_DEFAULT,Times(Csc(Plus(c_DEFAULT,Times(d_DEFAULT,Power(x_,n_)))),b_DEFAULT)),p_DEFAULT),x_Symbol),
    Condition(Dist(Power(n,CN1),Subst(Int(Times(Power(x,Subtract(Power(n,CN1),C1)),Power(Plus(a,Times(b,Csc(Plus(c,Times(d,x))))),p)),x),x,Power(x,n)),x),And(FreeQ(List(a,b,c,d,p),x),IGtQ(Power(n,CN1),C0),IntegerQ(p))));
IIntegrate(4198,Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Sec(Plus(c_DEFAULT,Times(d_DEFAULT,Power(x_,n_)))))),p_DEFAULT),x_Symbol),
    Condition(Unintegrable(Power(Plus(a,Times(b,Sec(Plus(c,Times(d,Power(x,n)))))),p),x),FreeQ(List(a,b,c,d,n,p),x)));
IIntegrate(4199,Int(Power(Plus(a_DEFAULT,Times(Csc(Plus(c_DEFAULT,Times(d_DEFAULT,Power(x_,n_)))),b_DEFAULT)),p_DEFAULT),x_Symbol),
    Condition(Unintegrable(Power(Plus(a,Times(b,Csc(Plus(c,Times(d,Power(x,n)))))),p),x),FreeQ(List(a,b,c,d,n,p),x)));
IIntegrate(4200,Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Sec(Plus(c_DEFAULT,Times(d_DEFAULT,Power(u_,n_)))))),p_DEFAULT),x_Symbol),
    Condition(Dist(Power(Coefficient(u,x,C1),CN1),Subst(Int(Power(Plus(a,Times(b,Sec(Plus(c,Times(d,Power(x,n)))))),p),x),x,u),x),And(FreeQ(List(a,b,c,d,n,p),x),LinearQ(u,x),NeQ(u,x))));
  }
}
}