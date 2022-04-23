int index = (int)(choice.length()* Math.random());
​
meaning==>Presumibily it tries to select randomly an index of the array.Math.random returns a double
in the range of [0,1), so index is always set with a value within the indexes range of the array. I used to use Random.nextInt method for extract pseudocasual ints within a hiven range.
​