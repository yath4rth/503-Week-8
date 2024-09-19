class Credit extends BankAccount{
	private double rate;
	public Credit(double rate)
	{
		this.rate = rate;
	}
	public double interest()
	{
		if(balance<0)
		{
		return Math.abs(rate*balance);
		}
		else {
			return 0.0;
		}
	}
	}