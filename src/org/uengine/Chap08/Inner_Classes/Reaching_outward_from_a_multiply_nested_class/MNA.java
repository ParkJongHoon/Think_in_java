package org.uengine.Chap08.Inner_Classes.Reaching_outward_from_a_multiply_nested_class;

class MNA {
	private void f() {}
	class A {
		private void g() {}
		public class B {
			void h() {
				g();
				f();
			}
		}
	}
}
