val a = Array(1,2,3,-1,211,2342)
a.reduceLeft((a,b)=> if(a>b) a else b )