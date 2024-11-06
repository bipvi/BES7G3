package bip.vi.BES7G3;

import bip.vi.BES7G3.entities.Info;
import bip.vi.BES7G3.entities.UserData;
import bip.vi.BES7G3.entities.UserDataAdapter;
import bip.vi.BES7G3.entities.UserDbTable;
import bip.vi.BES7G3.interfaces.DataSource;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Bes7G3Application {

	public static void main(String[] args) {
		System.out.println("Hello World!");

		Info persona1 = new Info("Mario", "Rossi", new Date(98, 4, 15));
		Info persona2 = new Info("Giovanni", "Verdi", new Date(12, 11, 30));
		Info persona3 = new Info("Giulia", "Zoocco", new Date(100, 2, 20));

		UserData utente1 = new UserData("Alessio Verdi", 30);
		UserData utente2 = new UserData("Martina Carrozzo", 25);
		UserData utente3 = new UserData("Luca Rosso", 40);


		UserDataAdapter uda1 = new UserDataAdapter(persona1);
		UserDataAdapter uda2 = new UserDataAdapter(persona2);
		UserDataAdapter uda3 = new UserDataAdapter(persona3);

		List<DataSource> dList = new ArrayList<>();
		dList.add((DataSource) utente1);
		dList.add(utente2);
		dList.add(utente3);
		dList.add(uda1);
		dList.add(uda2);
		dList.add(uda3);

		UserDbTable udt = new UserDbTable();


		for(DataSource d : dList){

			System.out.println(d.toString());

			if(udt.correctData(d))
				System.out.println(d.getNomeCompleto() + " può entrare!");
			else
				System.out.println(d.getNomeCompleto() + " non può entrare!");
		}



	}
}
