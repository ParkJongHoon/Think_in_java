package org.uengine.chap06.Polymorphism.Covariant_return_types;


public class WheatMill extends Mill {
	Wheat Process(){ return new Wheat();}

}
