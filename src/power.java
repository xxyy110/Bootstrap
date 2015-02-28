public int CalculatePower(int base, int power) {
	
	if (power == 0) {return 1;}

	return result * CalculatePower(base, power - 1);
}

public string ReverseStr(string str) {
	
	int strLen = str.length();

	if (strLen== 1) {return str;}

	return ReverseStr(str.substring(1)) + str.indexOf(0);

}