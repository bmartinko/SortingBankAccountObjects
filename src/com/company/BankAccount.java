package com.company;

    public class BankAccount /*implements Comparable*/
    {
        public BankAccount(String nm, double bal)
        {
            name = nm;
            balance = bal;
        }

        /*public int compareTo(Object otherObject)
        {

            BankAccount otherAccount = (BankAccount) otherObject;
            int retValue;
            if (balance < otherAccount.balance)
            {
                retValue = -1;
            }
            else
            {
                if (balance > otherAccount.balance)
                {
                    retValue = 1;
                }
                else
                {
                    retValue = 0;
                }
            }
            return retValue;

        }*/

        /*public int compareTo(Object otherObject){
            BankAccount otherAccount = (BankAccount) otherObject;
            return name.compareTo(otherAccount.name);
        } Sorting Bank Accounts Alphabetically*/
        public String name;
        public double balance;
    }

