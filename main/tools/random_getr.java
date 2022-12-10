package main.tools;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
 
public class random_getr {
 
    static List<String> data_pkmn = Arrays.asList("Bulbizarre","Herbizarre","Florizarre", "Salamèche", "Reptincel","Dracaufeu","Carapuce","Carabaffe","Tortank","Chenipan","Chrysacier","Papilusion","Aspicot","Coconfort","Dardargnan","Roucool","Roucoups", "Roucarnage","Rattata","Rattatac","Piafabec","Rapasdepic","Abo","Arbok","Pikachu", "Raichu","Sabelette","Sablaireau", "Nidoran♀", "Nidorina", "Nidoqueen","Nidoran♂","Nidorino", "Nidoking", "Mélofée", "Mélodelfe", "Goupix", "Feunard", "Rondoudou", "Grodoudou", "Nosferapti", "Nosferalto","Mystherbe", "Ortide", "Rafflesia", "Paras", "Parasect", "Mimitoss", "Aéromite", "Taupiqueur", "Triopikeur", "Miaouss", "Persian", "Psykokwak", "Akwakwak", "Férosinge", "Colossinge", "Caninos", "Arcanin", "Ptitard", "Têtarte", "Tartard", "Abra", "Kadabra", "Alakazam", "Machoc", "Machopeur", "Mackogneur", "Chétiflor", "Boustiflor", "Empiflor", "Tentacool", "Tentacruel", "Racaillou", "Gravalanch", "Grolem", "Ponyta", "Galopa", "Ramoloss", "Flagadoss", "Magnéti", "Magnéton", "Canarticho", "Doduo", "Dodrio", "Otaria", "Lamantine", "Tadmorv", "Grotadmorv", "Kokiyas", "Crustabri", "Fantominus", "Spectrum", "Ectoplasma", "Onix", "Soporifik", "Hypnomade", "Krabby", "Krabboss", "Voltorbe", "Électrode", "Noeunoeuf", "Noadkoko", "Osselait", "Ossatueur", "Kicklee", "Tygnon", "Excelangue", "Smogo", "Smogogo", "Rhinocorne", "Rhinoféros", "Leveinard", "Saquedeneu", "Kangourex", "Hypotrempe", "Hypocéan", "Poissirène", "Poissoroy", "Stari", "Staross", "M. Mime", "Insécateur", "Lippoutou", "Élektek", "Magmar", "Scarabrute", "Tauros", "Magicarpe", "Léviator", "Lokhlass", "Métamorph", "Évoli", "Aquali","Voltali","Pyroli", "Porygon", "Amonita", "Amonistar", "Kabuto", "Kabutops", "Ptéra", "Ronflex", "Artikodin", "Électhor", "Sulfura", "Minidraco", "Draco", "Dracolosse", "Mewtwo", "Mew");
    static List<String> data_pays = Arrays.asList("Afghanistan","Afrique du Sud","Albanie","Algérie","Allemagne","Andorre","Angola","Anguilla","Antarctique","Antigua-et-Barbuda","Antilles néerlandaises","Arabie saoudite","Argentine","Arménie","Aruba","Australie","Autriche","Azerbaïdjan","Bahamas","Bahreïn","Bangladesh","Barbade","Bélarus","Belgique","Belize","Bénin","Bermudes","Bhoutan","Bolivie","Bosnie","Botswana","Brésil","Brunéi","Bulgarie","Burkina Faso","Burundi","Cambodge","Cameroun","Canada","Cap-Vert","Ceuta et Melilla","Chili","Chine","Chypre","Colombie","Comores","Congo-Brazzaville","Corée du Nord","Corée du Sud","Costa Rica","Côte d’Ivoire","Croatie","Cuba","Danemark","Diego Garcia","Djibouti","Dominique","Égypte","Salvador","Émirats arabes unis","Équateur","Érythrée","Espagne","Estonie","Vatican","États fédérés de Micronésie","États-Unis","Éthiopie","Fidji","Finlande","France","Gabon","Gambie","Géorgie","Géorgie du Sud et les îles Sandwich du Sud","Ghana","Gibraltar","Grèce","Grenade","Groenland","Guadeloupe","Guam","Guatemala","Guernesey","Guinée","Guinée équatoriale","Guinée-Bissau","Guyana","Guyane française","Haïti","Honduras","Hongrie","Île Bouvet","Île Christmas","Île Clipperton","Île de l'Ascension","Île de Man","Île Norfolk","Îles Åland","Îles Caïmans","Îles Canaries","Îles Cocos - Keeling","Îles Cook","Îles Féroé","Îles Heard et MacDonald","Îles Malouines","Îles Mariannes du Nord","Îles Marshall","Îles Mineures Éloignées des États-Unis","Îles Salomon","Îles Turks et Caïques","Îles Vierges britanniques","Îles Vierges des États-Unis","Inde","Indonésie","Irak","Iran","Irlande","Islande","Israël","Italie","Jamaïque","Japon","Jersey","Jordanie","Kazakhstan","Kenya","Kirghizistan","Kiribati","Koweït","Laos","Lesotho","Lettonie","Liban","Libéria","Libye","Liechtenstein","Lituanie","Luxembourg","Macédoine","Madagascar","Malaisie","Malawi","Maldives","Mali","Malte","Maroc","Martinique","Maurice","Mauritanie","Mayotte","Mexique","Moldavie","Monaco","Mongolie","Monténégro","Montserrat","Mozambique","Myanmar","Namibie","Nauru","Népal","Nicaragua","Niger","Nigéria","Niue","Norvège","Nouvelle-Calédonie","Nouvelle-Zélande","Oman","Ouganda","Ouzbékistan","Pakistan","Palaos","Panama","Papouasie-Nouvelle-Guinée","Paraguay","Pays-Bas","Pérou","Philippines","Pitcairn","Pologne","Polynésie française","Porto Rico","Portugal","Qatar","R.A.S. chinoise de Hong Kong","R.A.S. chinoise de Macao","régions éloignées de l’Océanie","République centrafricaine","République démocratique du Congo","République dominicaine","République tchèque","Réunion","Roumanie","Royaume-Uni","Russie","Rwanda","Sahara occidental","Saint-Barthélémy","Saint-Kitts-et-Nevis","Saint-Marin","Saint-Martin","Saint-Pierre-et-Miquelon","Saint-Vincent-et-les Grenadines","Sainte-Hélène","Sainte-Lucie","Samoa","Samoa américaines","Sao Tomé-et-Principe","Sénégal","Serbie","Serbie-et-Monténégro","Seychelles","Sierra Leone","Singapour","Slovaquie","Slovénie","Somalie","Soudan","Sri Lanka","Suède","Suisse","Suriname","Svalbard et Île Jan Mayen","Swaziland","Syrie","Tadjikistan","Taïwan","Tanzanie","Tchad","Terres australes françaises","Territoire britannique de l'océan Indien","Territoire palestinien","Thaïlande","Timor oriental","Togo","Tokelau","Tonga","Trinité-et-Tobago","Tristan da Cunha","Tunisie","Turkménistan","Turquie","Tuvalu","Ukraine","Union européenne","Uruguay","Vanuatu","Venezuela","Vietnam","Wallis-et-Futuna","Yémen","Zambie","Zimbabwe");
    public static String getRandomWord(List<String> list)
    {
        double d = Math.random(); 
        int n = (int)d;
        n = (int)(Math.random() * list.size()-1);
        String random_word = list.get(n);
        if (random_word.length()>12){ // On rechoisi au hasard de manière récursive si le mot est trop long
            random_word = getRandomWord(list);
        }
        return random_word;
  
    }
	public static<T> void shuffle(List<T> list){
		Random random = new Random();

		// start from the end of the list
		for (int i = list.size() - 1; i >= 1; i--){
			// get a random index `j` such that `0 <= j <= i`
			int j = random.nextInt(i + 1);

			// swap element at i'th position in the list with the element at
			// randomly generated index `j`
			T obj = list.get(i);
			list.set(i, list.get(j));
			list.set(j, obj);
		}
	}

	// Optimized mix of the word letters 
	public static String swap (String word) {
		int idem = 0; // Nb of letters at same place after shuffle
		int percent; // Percent of similarity between word and swappedword
		ArrayList<String> charList = new ArrayList<String>(); // List containing letters
		for (int i=0; i<word.length(); i++) { // Read each letter of word
			String strElem = Character.toString(word.charAt(i)); // Convert char i of word into string
			charList.add(strElem); // Add letter to a list
		}
		shuffle(charList); // Mix list first time
		String swappedword = String.join("", charList); // List elements concatenate into string
		for (int i=0; i<word.length(); i++) { // Read each letter of the swappedword
			if (word.charAt(i) == swappedword.charAt(i)){ // Check same letters at same place between word/swappedword
				idem++; // Nb of same letters
			}
		}
		percent = idem/(word.length()*100); // Percentage of similarity between word and swapped word
		while (percent>=10 || word.charAt(0) == swappedword.charAt(0)){ // Remix until similarty percentage low enough and first letter different
			shuffle(charList);
			swappedword = String.join("", charList);
			for (int j=0; j<word.length(); j++) {
				if (word.charAt(j) == swappedword.charAt(j)){
					idem++;
				}
			}
			percent = idem/(word.length()*100);

		}
		return swappedword;
	}

    public static Boolean compareWords(String word1, String word2)
    {
        word1 = word1.toUpperCase();
        System.out.println(word1);
        word2 = word2.toUpperCase();
        System.out.println(word2);
        if(word1 == word2){
            System.out.println("Gagné!");
            return true;
        }
        else{
            System.out.println("Perdu!");
            return false;
        }
    }

	public static void main(String[] args)
	{
		String mot = getRandomWord(data_pays).toLowerCase();
        System.out.println(mot);
		System.out.println(swap(mot));
	}
}