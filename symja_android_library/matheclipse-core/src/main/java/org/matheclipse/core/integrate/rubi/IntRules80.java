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
public class IntRules80 { 

	public static void initialize() {
		Initializer.init();
	}

	private static class Initializer  {

		private static void init() {
IIntegrate(2001,Int(Power(Plus(Times(a_DEFAULT,Power(x_,j_DEFAULT)),Times(b_DEFAULT,Power(x_,n_DEFAULT))),p_),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,n))),Plus(p,C1)),Power(Times(a,Subtract(n,j),Plus(p,C1),Power(x,Subtract(j,C1))),CN1)),x)),Dist(Times(Plus(Times(n,p),n,Negate(j),C1),Power(Times(a,Subtract(n,j),Plus(p,C1)),CN1)),Int(Times(Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,n))),Plus(p,C1)),Power(Power(x,j),CN1)),x),x)),And(FreeQ(List(a,b,j,n),x),Not(IntegerQ(p)),NeQ(n,j),ILtQ(Simplify(Times(Plus(Times(n,p),n,Negate(j),C1),Power(Subtract(n,j),CN1))),C0),LtQ(p,CN1))));
IIntegrate(2002,Int(Power(Plus(Times(a_DEFAULT,Power(x_,j_DEFAULT)),Times(b_DEFAULT,Power(x_,n_DEFAULT))),p_),x_Symbol),
    Condition(Subtract(Simp(Times(Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,n))),Plus(p,C1)),Power(Times(a,Plus(Times(j,p),C1),Power(x,Subtract(j,C1))),CN1)),x),Dist(Times(b,Plus(Times(n,p),n,Negate(j),C1),Power(Times(a,Plus(Times(j,p),C1)),CN1)),Int(Times(Power(x,Subtract(n,j)),Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,n))),p)),x),x)),And(FreeQ(List(a,b,j,n,p),x),Not(IntegerQ(p)),NeQ(n,j),ILtQ(Simplify(Times(Plus(Times(n,p),n,Negate(j),C1),Power(Subtract(n,j),CN1))),C0),NeQ(Plus(Times(j,p),C1),C0))));
IIntegrate(2003,Int(Power(Plus(Times(a_DEFAULT,Power(x_,j_DEFAULT)),Times(b_DEFAULT,Power(x_,n_DEFAULT))),p_),x_Symbol),
    Condition(Subtract(Simp(Times(x,Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,n))),p),Power(Plus(Times(j,p),C1),CN1)),x),Dist(Times(b,Subtract(n,j),p,Power(Plus(Times(j,p),C1),CN1)),Int(Times(Power(x,n),Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,n))),Subtract(p,C1))),x),x)),And(FreeQ(List(a,b),x),Not(IntegerQ(p)),LtQ(C0,j,n),GtQ(p,C0),LtQ(Plus(Times(j,p),C1),C0))));
IIntegrate(2004,Int(Power(Plus(Times(a_DEFAULT,Power(x_,j_DEFAULT)),Times(b_DEFAULT,Power(x_,n_DEFAULT))),p_),x_Symbol),
    Condition(Plus(Simp(Times(x,Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,n))),p),Power(Plus(Times(n,p),C1),CN1)),x),Dist(Times(a,Subtract(n,j),p,Power(Plus(Times(n,p),C1),CN1)),Int(Times(Power(x,j),Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,n))),Subtract(p,C1))),x),x)),And(FreeQ(List(a,b),x),Not(IntegerQ(p)),LtQ(C0,j,n),GtQ(p,C0),NeQ(Plus(Times(n,p),C1),C0))));
IIntegrate(2005,Int(Power(Plus(Times(a_DEFAULT,Power(x_,j_DEFAULT)),Times(b_DEFAULT,Power(x_,n_DEFAULT))),p_),x_Symbol),
    Condition(Subtract(Simp(Times(Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,n))),Plus(p,C1)),Power(Times(b,Subtract(n,j),Plus(p,C1),Power(x,Subtract(n,C1))),CN1)),x),Dist(Times(Plus(Times(j,p),Negate(n),j,C1),Power(Times(b,Subtract(n,j),Plus(p,C1)),CN1)),Int(Times(Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,n))),Plus(p,C1)),Power(Power(x,n),CN1)),x),x)),And(FreeQ(List(a,b),x),Not(IntegerQ(p)),LtQ(C0,j,n),LtQ(p,CN1),GtQ(Plus(Times(j,p),C1),Subtract(n,j)))));
IIntegrate(2006,Int(Power(Plus(Times(a_DEFAULT,Power(x_,j_DEFAULT)),Times(b_DEFAULT,Power(x_,n_DEFAULT))),p_),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,n))),Plus(p,C1)),Power(Times(a,Subtract(n,j),Plus(p,C1),Power(x,Subtract(j,C1))),CN1)),x)),Dist(Times(Plus(Times(n,p),n,Negate(j),C1),Power(Times(a,Subtract(n,j),Plus(p,C1)),CN1)),Int(Times(Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,n))),Plus(p,C1)),Power(Power(x,j),CN1)),x),x)),And(FreeQ(List(a,b),x),Not(IntegerQ(p)),LtQ(C0,j,n),LtQ(p,CN1))));
IIntegrate(2007,Int(Power(Plus(Times(a_DEFAULT,Power(x_,j_DEFAULT)),Times(b_DEFAULT,Power(x_,n_DEFAULT))),p_),x_Symbol),
    Condition(Plus(Simp(Times(x,Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,n))),p),Power(Times(p,Subtract(n,j)),CN1)),x),Dist(a,Int(Times(Power(x,j),Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,n))),Subtract(p,C1))),x),x)),And(FreeQ(List(a,b,j,n),x),IGtQ(Plus(p,C1D2),C0),NeQ(n,j),EqQ(Simplify(Plus(Times(j,p),C1)),C0))));
IIntegrate(2008,Int(Power(Plus(Times(a_DEFAULT,Sqr(x_)),Times(b_DEFAULT,Power(x_,n_DEFAULT))),CN1D2),x_Symbol),
    Condition(Dist(Times(C2,Power(Subtract(C2,n),CN1)),Subst(Int(Power(Subtract(C1,Times(a,Sqr(x))),CN1),x),x,Times(x,Power(Plus(Times(a,Sqr(x)),Times(b,Power(x,n))),CN1D2))),x),And(FreeQ(List(a,b,n),x),NeQ(n,C2))));
IIntegrate(2009,Int(Power(Plus(Times(a_DEFAULT,Power(x_,j_DEFAULT)),Times(b_DEFAULT,Power(x_,n_DEFAULT))),p_),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,n))),Plus(p,C1)),Power(Times(a,Subtract(n,j),Plus(p,C1),Power(x,Subtract(j,C1))),CN1)),x)),Dist(Times(Plus(Times(n,p),n,Negate(j),C1),Power(Times(a,Subtract(n,j),Plus(p,C1)),CN1)),Int(Times(Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,n))),Plus(p,C1)),Power(Power(x,j),CN1)),x),x)),And(FreeQ(List(a,b,j,n),x),ILtQ(Plus(p,C1D2),C0),NeQ(n,j),EqQ(Simplify(Plus(Times(j,p),C1)),C0))));
IIntegrate(2010,Int(Power(Plus(Times(a_DEFAULT,Power(x_,j_DEFAULT)),Times(b_DEFAULT,Power(x_,n_DEFAULT))),CN1D2),x_Symbol),
    Condition(Subtract(Simp(Times(CN2,Sqrt(Plus(Times(a,Power(x,j)),Times(b,Power(x,n)))),Power(Times(b,Subtract(n,C2),Power(x,Subtract(n,C1))),CN1)),x),Dist(Times(a,Subtract(Subtract(Times(C2,n),j),C2),Power(Times(b,Subtract(n,C2)),CN1)),Int(Power(Times(Power(x,Subtract(n,j)),Sqrt(Plus(Times(a,Power(x,j)),Times(b,Power(x,n))))),CN1),x),x)),And(FreeQ(List(a,b),x),LtQ(Times(C2,Subtract(n,C1)),j,n))));
IIntegrate(2011,Int(Power(Plus(Times(a_DEFAULT,Power(x_,j_DEFAULT)),Times(b_DEFAULT,Power(x_,n_DEFAULT))),p_),x_Symbol),
    Condition(Dist(Times(Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,n))),FracPart(p)),Power(Times(Power(x,Times(j,FracPart(p))),Power(Plus(a,Times(b,Power(x,Subtract(n,j)))),FracPart(p))),CN1)),Int(Times(Power(x,Times(j,p)),Power(Plus(a,Times(b,Power(x,Subtract(n,j)))),p)),x),x),And(FreeQ(List(a,b,j,n,p),x),Not(IntegerQ(p)),NeQ(n,j),PosQ(Subtract(n,j)))));
IIntegrate(2012,Int(Power(Plus(Times(a_DEFAULT,Power(u_,j_DEFAULT)),Times(b_DEFAULT,Power(u_,n_DEFAULT))),p_),x_Symbol),
    Condition(Dist(Power(Coefficient(u,x,C1),CN1),Subst(Int(Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,n))),p),x),x,u),x),And(FreeQ(List(a,b,j,n,p),x),LinearQ(u,x),NeQ(u,x))));
IIntegrate(2013,Int(Times(Power(x_,m_DEFAULT),Power(Plus(Times(a_DEFAULT,Power(x_,j_DEFAULT)),Times(b_DEFAULT,Power(x_,n_))),p_)),x_Symbol),
    Condition(Dist(Power(n,CN1),Subst(Int(Power(Plus(Times(a,Power(x,Simplify(Times(j,Power(n,CN1))))),Times(b,x)),p),x),x,Power(x,n)),x),And(FreeQ(List(a,b,j,m,n,p),x),Not(IntegerQ(p)),NeQ(n,j),IntegerQ(Simplify(Times(j,Power(n,CN1)))),EqQ(Simplify(Plus(m,Negate(n),C1)),C0))));
IIntegrate(2014,Int(Times(Power(Times(c_DEFAULT,x_),m_DEFAULT),Power(Plus(Times(a_DEFAULT,Power(x_,j_DEFAULT)),Times(b_DEFAULT,Power(x_,n_DEFAULT))),p_)),x_Symbol),
    Condition(Negate(Simp(Times(Power(c,Subtract(j,C1)),Power(Times(c,x),Plus(m,Negate(j),C1)),Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,n))),Plus(p,C1)),Power(Times(a,Subtract(n,j),Plus(p,C1)),CN1)),x)),And(FreeQ(List(a,b,c,j,m,n,p),x),Not(IntegerQ(p)),NeQ(n,j),EqQ(Plus(m,Times(n,p),n,Negate(j),C1),C0),Or(IntegerQ(j),GtQ(c,C0)))));
IIntegrate(2015,Int(Times(Power(Times(c_DEFAULT,x_),m_DEFAULT),Power(Plus(Times(a_DEFAULT,Power(x_,j_DEFAULT)),Times(b_DEFAULT,Power(x_,n_DEFAULT))),p_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(c,Subtract(j,C1)),Power(Times(c,x),Plus(m,Negate(j),C1)),Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,n))),Plus(p,C1)),Power(Times(a,Subtract(n,j),Plus(p,C1)),CN1)),x)),Dist(Times(Power(c,j),Plus(m,Times(n,p),n,Negate(j),C1),Power(Times(a,Subtract(n,j),Plus(p,C1)),CN1)),Int(Times(Power(Times(c,x),Subtract(m,j)),Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,n))),Plus(p,C1))),x),x)),And(FreeQ(List(a,b,c,j,m,n),x),Not(IntegerQ(p)),NeQ(n,j),ILtQ(Simplify(Times(Plus(m,Times(n,p),n,Negate(j),C1),Power(Subtract(n,j),CN1))),C0),LtQ(p,CN1),Or(IntegerQ(j),GtQ(c,C0)))));
IIntegrate(2016,Int(Times(Power(Times(c_DEFAULT,x_),m_DEFAULT),Power(Plus(Times(a_DEFAULT,Power(x_,j_DEFAULT)),Times(b_DEFAULT,Power(x_,n_DEFAULT))),p_)),x_Symbol),
    Condition(Subtract(Simp(Times(Power(c,Subtract(j,C1)),Power(Times(c,x),Plus(m,Negate(j),C1)),Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,n))),Plus(p,C1)),Power(Times(a,Plus(m,Times(j,p),C1)),CN1)),x),Dist(Times(b,Plus(m,Times(n,p),n,Negate(j),C1),Power(Times(a,Power(c,Subtract(n,j)),Plus(m,Times(j,p),C1)),CN1)),Int(Times(Power(Times(c,x),Subtract(Plus(m,n),j)),Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,n))),p)),x),x)),And(FreeQ(List(a,b,c,j,m,n,p),x),Not(IntegerQ(p)),NeQ(n,j),ILtQ(Simplify(Times(Plus(m,Times(n,p),n,Negate(j),C1),Power(Subtract(n,j),CN1))),C0),NeQ(Plus(m,Times(j,p),C1),C0),Or(IntegersQ(j,n),GtQ(c,C0)))));
IIntegrate(2017,Int(Times(Power(Times(c_,x_),m_DEFAULT),Power(Plus(Times(a_DEFAULT,Power(x_,j_DEFAULT)),Times(b_DEFAULT,Power(x_,n_DEFAULT))),p_)),x_Symbol),
    Condition(Dist(Times(Power(c,IntPart(m)),Power(Times(c,x),FracPart(m)),Power(Power(x,FracPart(m)),CN1)),Int(Times(Power(x,m),Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,n))),p)),x),x),And(FreeQ(List(a,b,c,j,m,n,p),x),Not(IntegerQ(p)),NeQ(n,j),ILtQ(Simplify(Times(Plus(m,Times(n,p),n,Negate(j),C1),Power(Subtract(n,j),CN1))),C0))));
IIntegrate(2018,Int(Times(Power(x_,m_DEFAULT),Power(Plus(Times(a_DEFAULT,Power(x_,j_DEFAULT)),Times(b_DEFAULT,Power(x_,n_))),p_)),x_Symbol),
    Condition(Dist(Power(n,CN1),Subst(Int(Times(Power(x,Subtract(Simplify(Times(Plus(m,C1),Power(n,CN1))),C1)),Power(Plus(Times(a,Power(x,Simplify(Times(j,Power(n,CN1))))),Times(b,x)),p)),x),x,Power(x,n)),x),And(FreeQ(List(a,b,j,m,n,p),x),Not(IntegerQ(p)),NeQ(n,j),IntegerQ(Simplify(Times(j,Power(n,CN1)))),IntegerQ(Simplify(Times(Plus(m,C1),Power(n,CN1)))),NeQ(Sqr(n),C1))));
IIntegrate(2019,Int(Times(Power(Times(c_,x_),m_DEFAULT),Power(Plus(Times(a_DEFAULT,Power(x_,j_DEFAULT)),Times(b_DEFAULT,Power(x_,n_))),p_)),x_Symbol),
    Condition(Dist(Times(Power(c,IntPart(m)),Power(Times(c,x),FracPart(m)),Power(Power(x,FracPart(m)),CN1)),Int(Times(Power(x,m),Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,n))),p)),x),x),And(FreeQ(List(a,b,c,j,m,n,p),x),Not(IntegerQ(p)),NeQ(n,j),IntegerQ(Simplify(Times(j,Power(n,CN1)))),IntegerQ(Simplify(Times(Plus(m,C1),Power(n,CN1)))),NeQ(Sqr(n),C1))));
IIntegrate(2020,Int(Times(Power(Times(c_DEFAULT,x_),m_),Power(Plus(Times(a_DEFAULT,Power(x_,j_DEFAULT)),Times(b_DEFAULT,Power(x_,n_DEFAULT))),p_)),x_Symbol),
    Condition(Subtract(Simp(Times(Power(Times(c,x),Plus(m,C1)),Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,n))),p),Power(Times(c,Plus(m,Times(j,p),C1)),CN1)),x),Dist(Times(b,p,Subtract(n,j),Power(Times(Power(c,n),Plus(m,Times(j,p),C1)),CN1)),Int(Times(Power(Times(c,x),Plus(m,n)),Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,n))),Subtract(p,C1))),x),x)),And(FreeQ(List(a,b,c),x),Not(IntegerQ(p)),LtQ(C0,j,n),Or(IntegersQ(j,n),GtQ(c,C0)),GtQ(p,C0),LtQ(Plus(m,Times(j,p),C1),C0))));
IIntegrate(2021,Int(Times(Power(Times(c_DEFAULT,x_),m_DEFAULT),Power(Plus(Times(a_DEFAULT,Power(x_,j_DEFAULT)),Times(b_DEFAULT,Power(x_,n_DEFAULT))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Times(c,x),Plus(m,C1)),Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,n))),p),Power(Times(c,Plus(m,Times(n,p),C1)),CN1)),x),Dist(Times(a,Subtract(n,j),p,Power(Times(Power(c,j),Plus(m,Times(n,p),C1)),CN1)),Int(Times(Power(Times(c,x),Plus(m,j)),Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,n))),Subtract(p,C1))),x),x)),And(FreeQ(List(a,b,c,m),x),Not(IntegerQ(p)),LtQ(C0,j,n),Or(IntegersQ(j,n),GtQ(c,C0)),GtQ(p,C0),NeQ(Plus(m,Times(n,p),C1),C0))));
IIntegrate(2022,Int(Times(Power(Times(c_DEFAULT,x_),m_DEFAULT),Power(Plus(Times(a_DEFAULT,Power(x_,j_DEFAULT)),Times(b_DEFAULT,Power(x_,n_DEFAULT))),p_)),x_Symbol),
    Condition(Subtract(Simp(Times(Power(c,Subtract(n,C1)),Power(Times(c,x),Plus(m,Negate(n),C1)),Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,n))),Plus(p,C1)),Power(Times(b,Subtract(n,j),Plus(p,C1)),CN1)),x),Dist(Times(Power(c,n),Plus(m,Times(j,p),Negate(n),j,C1),Power(Times(b,Subtract(n,j),Plus(p,C1)),CN1)),Int(Times(Power(Times(c,x),Subtract(m,n)),Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,n))),Plus(p,C1))),x),x)),And(FreeQ(List(a,b,c),x),Not(IntegerQ(p)),LtQ(C0,j,n),Or(IntegersQ(j,n),GtQ(c,C0)),LtQ(p,CN1),GtQ(Plus(m,Times(j,p),C1),Subtract(n,j)))));
IIntegrate(2023,Int(Times(Power(Times(c_DEFAULT,x_),m_DEFAULT),Power(Plus(Times(a_DEFAULT,Power(x_,j_DEFAULT)),Times(b_DEFAULT,Power(x_,n_DEFAULT))),p_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(c,Subtract(j,C1)),Power(Times(c,x),Plus(m,Negate(j),C1)),Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,n))),Plus(p,C1)),Power(Times(a,Subtract(n,j),Plus(p,C1)),CN1)),x)),Dist(Times(Power(c,j),Plus(m,Times(n,p),n,Negate(j),C1),Power(Times(a,Subtract(n,j),Plus(p,C1)),CN1)),Int(Times(Power(Times(c,x),Subtract(m,j)),Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,n))),Plus(p,C1))),x),x)),And(FreeQ(List(a,b,c,m),x),Not(IntegerQ(p)),LtQ(C0,j,n),Or(IntegersQ(j,n),GtQ(c,C0)),LtQ(p,CN1))));
IIntegrate(2024,Int(Times(Power(Times(c_DEFAULT,x_),m_DEFAULT),Power(Plus(Times(a_DEFAULT,Power(x_,j_DEFAULT)),Times(b_DEFAULT,Power(x_,n_DEFAULT))),p_)),x_Symbol),
    Condition(Subtract(Simp(Times(Power(c,Subtract(n,C1)),Power(Times(c,x),Plus(m,Negate(n),C1)),Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,n))),Plus(p,C1)),Power(Times(b,Plus(m,Times(n,p),C1)),CN1)),x),Dist(Times(a,Power(c,Subtract(n,j)),Plus(m,Times(j,p),Negate(n),j,C1),Power(Times(b,Plus(m,Times(n,p),C1)),CN1)),Int(Times(Power(Times(c,x),Subtract(m,Subtract(n,j))),Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,n))),p)),x),x)),And(FreeQ(List(a,b,c,m,p),x),Not(IntegerQ(p)),LtQ(C0,j,n),Or(IntegersQ(j,n),GtQ(c,C0)),GtQ(Plus(m,Times(j,p),C1,Negate(n),j),C0),NeQ(Plus(m,Times(n,p),C1),C0))));
IIntegrate(2025,Int(Times(Power(Times(c_DEFAULT,x_),m_DEFAULT),Power(Plus(Times(a_DEFAULT,Power(x_,j_DEFAULT)),Times(b_DEFAULT,Power(x_,n_DEFAULT))),p_)),x_Symbol),
    Condition(Subtract(Simp(Times(Power(c,Subtract(j,C1)),Power(Times(c,x),Plus(m,Negate(j),C1)),Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,n))),Plus(p,C1)),Power(Times(a,Plus(m,Times(j,p),C1)),CN1)),x),Dist(Times(b,Plus(m,Times(n,p),n,Negate(j),C1),Power(Times(a,Power(c,Subtract(n,j)),Plus(m,Times(j,p),C1)),CN1)),Int(Times(Power(Times(c,x),Subtract(Plus(m,n),j)),Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,n))),p)),x),x)),And(FreeQ(List(a,b,c,m,p),x),Not(IntegerQ(p)),LtQ(C0,j,n),Or(IntegersQ(j,n),GtQ(c,C0)),LtQ(Plus(m,Times(j,p),C1),C0))));
  }
}
}
