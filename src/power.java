public int CalculatePower(int base, int power) {
	
	if (power == 0) {return 1;}

	return result * CalculatePower(base, power - 1);
}