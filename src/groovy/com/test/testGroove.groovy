package com.test

import com.sun.tools.apt.Main;
	
		class testGroove{
	static main(String[] s){
		def helper="today"
		def today="today ${3*7}"
		def multiQuote="""
dfsfsd
bingo
"""
		println today
		println today.class.name
		println multiQuote
		
		
		def clozz={
			 name->println "Chello ${name}"
			  }
		
		
		def blob=clozz
		blob()
		def temp=instant()
		temp("hydro","helium","lithium")
}
	static instant(){
		return {
			nam1, nam2,nam3->println "returned CLosure ${nam1+nam2+nam3}"
		}
	}
		}