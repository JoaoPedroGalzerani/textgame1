package textgame;
import java.util.Scanner;
public class textgame {

	public static void main (String[] args) {
	//entrances
		Scanner keyboard= new Scanner(System.in);
		String start,name,quest,again;
		int feel,garden,garden2,money, money2,buy,cook;
	//Menu
		System.out.println("Feel");
		System.out.println("Precione S para começar");
		start=keyboard.next();
	//Game
while (start.equals("s")) {
	System.out.println("Qual o seu nome?");
	 name=keyboard.next();
	System.out.printf("Olá, " + name);
	System.out.println(".");
	System.out.printf("Qual o sentimento com o qual você mais conviveu na sua vida?");
	System.out.printf("1-Alegria;");
	System.out.printf("2-Tristeza;");
	System.out.printf("3-Raiva.");
	 feel = keyboard.nextInt();
	System.out.println("Entre 3 até 7, qual o seu número favorito?");
	money= keyboard.nextInt();
	if (feel == 1) 
	{
		System.out.println(name + ", aqui todos os humanos possuem uma marca.");
		System.out.println("Parece que a sua simboliza a alegria.");	
		System.out.println("Essa marca te permite ver dois jardins, sendo eles:");
		System.out.printf("1-Um de hortênsias;");
		System.out.printf("2-Um de tulipas;");
		System.out.println("Para qual você deseja ir?");
		 garden = keyboard.nextInt();
		   if(garden == 1) 
		   {
			   System.out.println("Ao entrar no jardim de hortênsias, você vê uma mulher no horizonte.");
			   System.out.println("Seus cabelos e seus olhos possuem a mesma cor: um azul que se destaca entre a paisagem arroxeada.");
			   System.out.println("Em sua mão direita há um buquê. Ele ainda é pequeno, mas está crescendo pouco a pouco.");
			   System.out.println("Ela começou a chorar, tentando esconder as lágrimas com o seu avental de jardinagem.");
			   System.out.println("Você gostaria de ajudá-la?");
			    quest = keyboard.next();
			   if ( quest.equals("N") || quest.equals("nao") || quest.equals("Não")) 
			   {
				   System.out.println("Você saiu do jardim.");
				   System.out.printf("1-Jardim de hortênsias;");
				   System.out.printf("2-Jardim de tulipas;");
				   System.out.println("Para qual você deseja ir?");
					garden = keyboard.nextInt();
			   }
			   if ( quest.equals("sim") || quest.equals("s"))
			   {
				   System.out.println("Você vai até ela e pergunta se está tudo bem.");
				   System.out.println("Ela diz que não, porque ninguém quer comprar flores tristes, mesmo sendo importantes.");
				   System.out.println(name + ", você tem duas opções, qual deseja seguir?");
				   System.out.printf("1-Comprar uma flor;");
				   System.out.println("2-Falar que vai comprar mais tarde.");
				    buy = keyboard.nextInt();
				   if (buy == 2) 
				   {
					   System.out.println("A jardineira só fica ainda mais triste, dizendo que todos dizem a mesma coisa, mas nunca voltam.");
					   System.out.println("Fim de jogo.");
					   System.out.println("aperte A para tentar novamente:");
					    again = keyboard.next();
					    if (again.equals("a")) 
					    {
					    	   System.out.println(name + ", você tem duas opções, qual deseja seguir?");
							   System.out.printf("1-Comprar uma flor;");
							   System.out.println("2-Falar que vai comprar mais tarde.");
							    buy = keyboard.nextInt();
					    }
					    
				   }
				   if (buy == 1) 
				   {
					   System.out.println("A jardineira olha para você com espanto.");
					   System.out.println("Enxugando as lágrimas, ela abre um sorriso para ti, tirando uma hortênsia do buquê e a entregando para você.");
					   System.out.print("Você tinha " + money);
					   System.out.println("níqueis");
					    money2 = money - 3;	
					   System.out.println("Agora possui: " + money2);
					   System.out.println("Ao sair do jardim, você ouve saindo de lá de dentro um:");
					   System.out.println("- Obrigada! ");
					   System.out.println("Para onde quer ir agora?");
					   System.out.printf("1-O jardim de tulipas.");
						 garden2 = keyboard.nextInt();
						 if (garden2== 1)
						 {
							 System.out.println("Entrando no jardim de tulipas, você percebe um homem se aproximando.");
							   System.out.println("Ele está zangado e seu cabelo bagunçado só o faz parecer ainda mais perigoso.");
							   System.out.println("- O que você quer?");
							   System.out.println("1-Quero comprar uma tulipa;");
							   System.out.println("2-Quero comer bolo.");
							   cook = keyboard.nextInt();
							   if (cook == 1)
							   {
								   System.out.println("Enfezado, o homem diz: ");
								   System.out.println("Não leu a placa lá fora? Estamos fechados. Dê o fora daqui!");
								   System.out.println("Fim de jogo.");
								   System.out.println("aperte A para tentar novamente:");
								    again = keyboard.next();
								    if (again.equals("a")) 
								    {
										   System.out.println("- O que você quer?");
										   System.out.println("1-Quero comprar uma tulipa;");
										   System.out.println("2-Quero comer bolo.");
										   cook = keyboard.nextInt();
								    }
							    if (cook==2)
							    {
							    	System.out.println("O homem fica espantado.");
							    	System.out.println("Do nada, seu rosto fica totalmente mudado, com um sorriso de bochecha a bochecha.");
							    	System.out.println("Como soube que o meu sonho era ser confeiteiro? Eu vou fazer o melhor bolo que você já comeu.");
							    	System.out.println("Feliz, ele faz questão de assar um bolo quentinho para você comer.");
							    	System.out.println("Com chantily, está escrito em cima do bolo: "+ name);
							    	System.out.printf("Após comer um bolo gostoso e por uma linda hortênsia em sua orelha, " + name);
							    	System.out.println(", Você pode finalmente apreciar o bom trabalho que fez, pois conseguiu transformar a tristeza e a raiva em felicidade.");
							    	System.out.println("Estou orgulhoso de você!");
							    	System.out.println("Obrigado por jogar.");
							    	System.out.println("Fim de jogo.");
							    	keyboard.close();
							    }
						 }
						 
					   }
		    }
			   if (! quest.equals("N") || ! quest.equals("nao") || ! quest.equals("Não") || ! quest.equals("s") || ! quest.equals("sim"))
			   {
				   System.out.println("Por favor, responda corretamente:");
				   quest = keyboard.next();
			   }
			  
	}
		   if(garden == 2) {
			   System.out.println("Entrando no jardim de tulipas, você percebe um homem se aproximando.");
			   System.out.println("Ele está zangado e seu cabelo bagunçado só o faz parecer ainda mais perigoso.");
			   System.out.println("- O que você quer?");
			   System.out.println("1-Quero comprar uma tulipa;");
			   System.out.println("2-Quero comer bolo.");
			   cook = keyboard.nextInt();
			   if (cook == 1)
			   {
				   System.out.println("Enfezado, o homem diz: ");
				   System.out.println("Não leu a placa lá fora? Estamos fechados. Dê o fora daqui!");
				   System.out.println("Fim de jogo.");
				   System.out.println("aperte A para tentar novamente:");
				    again = keyboard.next();
				    if (again.equals("a")) 
				    {
						   System.out.println("- O que você quer?");
						   System.out.println("1-Quero comprar uma tulipa;");
						   System.out.println("2-Quero comer bolo.");
						   cook = keyboard.nextInt();
				    }
			    if (cook==2)
			    {
			    	System.out.println("O homem fica espantado.");
			    	System.out.println("Do nada, seu rosto fica totalmente mudado, com um sorriso de bochecha a bochecha.");
			    	System.out.println("Como soube que o meu sonho era ser confeiteiro? Eu vou fazer o melhor bolo que você já comeu.");
			    	System.out.println("Feliz, ele faz questão de assar um bolo quentinho para você comer.");
			    	System.out.println("Com chantily, está escrito em cima do bolo: "+ name);
			    	System.out.println("Para onde quer ir agora?");
					   System.out.printf("1-O jardim de hortênsias.");
						 garden2 = keyboard.nextInt();
						 if (garden2== 1)
						 {
							 System.out.println("Ao entrar no jardim de hortênsias, você vê uma mulher no horizonte.");
							   System.out.println("Seus cabelos e seus olhos possuem a mesma cor: um azul que se destaca entre a paisagem arroxeada.");
							   System.out.println("Em sua mão direita há um buquê. Ele ainda é pequeno, mas está crescendo pouco a pouco.");
							   System.out.println("Ela começou a chorar, tentando esconder as lágrimas com o seu avental de jardinagem.");
							   System.out.println("Você gostaria de ajudá-la?");
							    quest = keyboard.next();
							   if ( quest.equals("N") || quest.equals("nao") || quest.equals("Não")) 
							   {
								   System.out.println("Você saiu do jardim.");
								   System.out.printf("1-Jardim de hortênsias;");
								   System.out.printf("2-Jardim de tulipas;");
								   System.out.println("Para qual você deseja ir?");
									garden = keyboard.nextInt();
							   }
							   if ( quest.equals("sim") || quest.equals("s"))
							   {
								   System.out.println("Você vai até ela e pergunta se está tudo bem.");
								   System.out.println("Ela diz que não, porque ninguém quer comprar flores tristes, mesmo sendo importantes.");
								   System.out.println(name + ", você tem duas opções, qual deseja seguir?");
								   System.out.printf("1-Comprar uma flor;");
								   System.out.println("2-Falar que vai comprar mais tarde.");
								    buy = keyboard.nextInt();
								   if (buy == 2) 
								   {
									   System.out.println("A jardineira só fica ainda mais triste, dizendo que todos dizem a mesma coisa, mas nunca voltam.");
									   System.out.println("Fim de jogo.");
									   System.out.println("aperte A para tentar novamente:");
									    again = keyboard.next();
									    if (again.equals("a")) 
									    {
									    	   System.out.println(name + ", você tem duas opções, qual deseja seguir?");
											   System.out.printf("1-Comprar uma flor;");
											   System.out.println("2-Falar que vai comprar mais tarde.");
											    buy = keyboard.nextInt();
									    }
									    
								   }
								   if (buy == 1) 
								   {
									   System.out.println("A jardineira olha para você com espanto.");
									   System.out.println("Enxugando as lágrimas, ela abre um sorriso para ti, tirando uma hortênsia do buquê e a entregando para você.");
									   System.out.print("Você tinha " + money);
									   System.out.println("níqueis");
									    money2 = money - 3;	
									   System.out.println("Agora possui: " + money2);
									   System.out.println("Ao sair do jardim, você ouve saindo de lá de dentro um:");
									   System.out.println("- Obrigada! ");
									   System.out.printf("Após comer um bolo gostoso e por uma linda hortênsia em sua orelha, " + name);
								    	System.out.println(", Você pode finalmente apreciar o bom trabalho que fez, pois conseguiu transformar a tristeza e a raiva em felicidade.");
								    	System.out.println("Estou orgulhoso de você!");
								    	System.out.println("Obrigado por jogar.");
								    	System.out.println("Fim de jogo.");
								    	keyboard.close();
						 } 
			    }
			    
			    }
				    
			   }
	
		   }
}		  
	}

}
	if (feel == 2)
	{
		System.out.println(name + ", aqui todos os humanos possuem uma marca.");
		System.out.println("Parece que a sua simboliza a tristeza.");	
		System.out.println("Essa marca te permite ver dois jardins, sendo eles:");
		System.out.printf("1-Um de narcisos;");
		System.out.printf("2-Um de tulipas;");
		System.out.println("Para qual você deseja ir?");
		 garden = keyboard.nextInt();
		   if(garden == 1) 
		   {
			   System.out.println("Ao entrar no jardim de narcisos, você vê uma mulher saltitante.");
			   System.out.println("Ela está jogando petalas para cima e quase que não percebe você.");
			   System.out.println("Ao perceber, ela te chama, com um sorriso que estampa todos os dentes dela.");
			   System.out.println("Você gostaria de ir até ela?");
			    quest = keyboard.next();
			   if ( quest.equals("N") || quest.equals("nao") || quest.equals("Não")) 
			   {
				   System.out.println("Você saiu do jardim.");
				   System.out.printf("1-Jardim de narcisos;");
				   System.out.printf("2-Jardim de tulipas;");
				   System.out.println("Para qual você deseja ir?");
					garden = keyboard.nextInt();
			   }
			   if ( quest.equals("sim") || quest.equals("s"))
			   {
				   System.out.println("Você vai até ela, sendo recebido com uma chuva de pétalas.");
				   System.out.println("Ela pergunta se você acha as flores dela bonitas.");
				   System.out.println(name + ", o que você acha?");
				   System.out.printf("1-São como ver as  cinzas de um vulcão caindo, enquanto você corre da lava escaldante, que apenas traz a misericórdia;");
				   System.out.println("2-São como sentir o cheiro de comida gostosa.");
				    buy = keyboard.nextInt();
				   if (buy == 2) 
				   {
					   System.out.println("A jardineira fica ainda mais feliz, concordando com o que você disse e saltidando como nunca antes tinha feito.");
					   System.out.println("Fim de jogo.");
					   System.out.println("aperte A para tentar novamente:");
					    again = keyboard.next();
					    if (again.equals("a")) 
					    {
					    	   System.out.println(name + ", você tem duas respostas em mente, qual deseja falar?");
							   System.out.printf("1-São como ver as  cinzas de um vulcão caindo, enquanto você corre da lava escaldante, que apenas traz a misericórdia;");
							   System.out.println("2-São como sentir o cheiro de comida gostosa.");
							    buy = keyboard.nextInt();
					    }
					    
				   }
				   if (buy == 1) 
				   {
					   System.out.println("A jardineira olha para você com espanto.");
					   System.out.println("Com o seu sorriso sumindo, ela para de pular, ficando tristonha.");
					   System.out.println("Ao sair do jardim, você ouve lamentações");
					   System.out.println("Para onde quer ir agora?");
					   System.out.printf("1-O jardim de tulipas.");
						 garden2 = keyboard.nextInt();
						 if (garden2== 1)
						 {
							 System.out.println("Entrando no jardim de tulipas, você percebe um homem se aproximando.");
							   System.out.println("Ele está zangado e seu cabelo bagunçado só o faz parecer ainda mais perigoso.");
							   System.out.println("- O que você quer?");
							   System.out.println("1-Quero comprar uma tulipa;");
							   System.out.println("2-Quero ver quem é a pessoa que desperdiçou a vida toda apenas sonhando com algo que nunca correu atrás para alcançar e agora vive de lamentações.");
							   cook = keyboard.nextInt();
							   if (cook == 1)
							   {
								   System.out.println("Enfezado, o homem diz: ");
								   System.out.println("Não leu a placa lá fora? Estamos fechados. Dê o fora daqui!");
								   System.out.println("Fim de jogo.");
								   System.out.println("aperte A para tentar novamente:");
								    again = keyboard.next();
								    if (again.equals("a")) 
								    {
										   System.out.println("- O que você quer?");
										   System.out.println("1-Quero comprar uma tulipa;");
										   System.out.println("2-Quero ver quem é a pessoa que desperdiçou a vida toda apenas sonhando com algo que nunca correu atrás para alcançar e agora vive de lamentações.");
										   cook = keyboard.nextInt();
								    }
							    if (cook==2)
							    {
							    	System.out.println("O homem fica entristecido.");
							    	System.out.println("Do nada, seu rosto fica totalmente mudado, com lágrimas escorrendo de bochecha a bochecha.");
							    	System.out.println("Eu só queria ser um confeiteiro.");
							    	System.out.println("Com as mãos no rosto, ele sai correndo rumo ao horizonte");
							    	System.out.printf("Após ver as lágrimas caindo, " + name);
							    	System.out.println(", Você pode finalmente depreciar a melancolia que causou, pois conseguiu transformar a felicidade e a raiva em tristeza.");
							    	System.out.println("Estou orgulhoso de você!");
							    	System.out.println("Obrigado por jogar.");
							    	System.out.println("Fim de jogo.");
							    	keyboard.close();
							    }
						 }
						 
					   }
		    }
			   if (! quest.equals("N") || ! quest.equals("nao") || ! quest.equals("Não") || ! quest.equals("s") || ! quest.equals("sim"))
			   {
				   System.out.println("Por favor, responda corretamente:");
				   quest = keyboard.next();
			   }
			  
	}
		   if(garden == 2) {
			   
			   System.out.println("Entrando no jardim de tulipas, você percebe um homem se aproximando.");
			   System.out.println("Ele está zangado e seu cabelo bagunçado só o faz parecer ainda mais perigoso.");
			   System.out.println("- O que você quer?");
			   System.out.println("1-Quero comprar uma tulipa;");
			   System.out.println("2-Quero ver quem é a pessoa que desperdiçou a vida toda apenas sonhando com algo que nunca correu atrás para alcançar e agora vive de lamentações.");
			   cook = keyboard.nextInt();
			   if (cook == 1)
			   {
				   System.out.println("Enfezado, o homem diz: ");
				   System.out.println("Não leu a placa lá fora? Estamos fechados. Dê o fora daqui!");
				   System.out.println("Fim de jogo.");
				   System.out.println("aperte A para tentar novamente:");
				    again = keyboard.next();
				    if (again.equals("a")) 
				    {
						   System.out.println("- O que você quer?");
						   System.out.println("1-Quero comprar uma tulipa;");
						   System.out.println("2-Quero ver quem é a pessoa que desperdiçou a vida toda apenas sonhando com algo que nunca correu atrás para alcançar e agora vive de lamentações.");
						   cook = keyboard.nextInt();
				    }
			    if (cook==2)
			    {
			    	System.out.println("O homem fica entristecido.");
			    	System.out.println("Do nada, seu rosto fica totalmente mudado, com lágrimas escorrendo de bochecha a bochecha.");
			    	System.out.println("Eu só queria ser um confeiteiro.");
			    	System.out.println("Com as mãos no rosto, ele sai correndo rumo ao horizonte");
			    	System.out.println("Para onde quer ir agora?");
					   System.out.printf("1-O jardim de narcisos.");
						 garden2 = keyboard.nextInt();
						 if (garden2== 1)
						 {
							 System.out.println("Ao entrar no jardim de narcisos, você vê uma mulher saltitante.");
							   System.out.println("Ela está jogando petalas para cima e quase que não percebe você.");
							   System.out.println("Ao perceber, ela te chama, com um sorriso que estampa todos os dentes dela.");
							   System.out.println("Você gostaria de ir até ela?");
							    quest = keyboard.next();
							   if ( quest.equals("N") || quest.equals("nao") || quest.equals("Não")) 
							   {
								   System.out.println("Você saiu do jardim.");
								   System.out.printf("1-Jardim de narcisos;");
								   System.out.printf("2-Jardim de tulipas;");
								   System.out.println("Para qual você deseja ir?");
									garden = keyboard.nextInt();
							   }
							   if ( quest.equals("sim") || quest.equals("s"))
							   {
										   System.out.println("Você vai até ela, sendo recebido com uma chuva de pétalas.");
										   System.out.println("Ela pergunta se você acha as flores dela bonitas.");
										   System.out.println(name + ", o que você acha?");
										   System.out.printf("1-São como ver as  cinzas de um vulcão caindo, enquanto você corre da lava escaldante, que apenas traz a misericórdia;");
										   System.out.println("2-São como sentir o cheiro de comida gostosa.");
										    buy = keyboard.nextInt();
										   if (buy == 2) 
										   {
											   System.out.println("A jardineira fica ainda mais feliz, concordando com o que você disse e saltidando como nunca antes tinha feito.");
											   System.out.println("Fim de jogo.");
											   System.out.println("aperte A para tentar novamente:");
											    again = keyboard.next();
											    if (again.equals("a")) 
											    {
											    	   System.out.println(name + ", você tem duas respostas em mente, qual deseja falar?");
													   System.out.printf("1-São como ver as  cinzas de um vulcão caindo, enquanto você corre da lava escaldante, que apenas traz a misericórdia;");
													   System.out.println("2-São como sentir o cheiro de comida gostosa.");
													    buy = keyboard.nextInt();
											    }
											    
										   }
										   if (buy == 1) 
										   {
											   System.out.println("A jardineira olha para você com espanto.");
											   System.out.println("Com o seu sorriso sumindo, ela para de pular, ficando tristonha.");
											   System.out.println("Ao sair do jardim, você ouve lamentações");
												System.out.printf("Após ver as lágrimas caindo, " + name);
										    	System.out.println(" , Você pode finalmente depreciar a melancolia que causou, pois conseguiu transformar a felicidade e a raiva em tristeza.");
										    	System.out.println("Estou orgulhoso de você!");
										    	System.out.println("Obrigado por jogar.");
										    	System.out.println("Fim de jogo.");
										    	keyboard.close();
										   }
									   }
											   		    
						 } 
			    }
			    
			    }
				    
			   }
	
		   }
}		  
	if (feel==3)
	{
		System.out.println(name + ", aqui todos os humanos possuem uma marca.");
		System.out.println("Parece que a sua simboliza a raiva.");	
		System.out.println("Essa marca te permite ver dois jardins, sendo eles:");
		System.out.printf("1-Um de hortênsias;");
		System.out.printf("2-Um de narcisos;");
		System.out.println("Para qual você deseja ir?");
		 garden = keyboard.nextInt();
		 if(garden == 1) 
		   {
			   System.out.println("Ao entrar no jardim de hortênsias, você vê uma mulher no horizonte.");
			   System.out.println("Seus cabelos e seus olhos possuem a mesma cor: um azul que se destaca entre a paisagem arroxeada.");
			   System.out.println("Em sua mão direita há um buquê. Ele ainda é pequeno, mas está crescendo pouco a pouco.");
			   System.out.println("Ela começou a chorar, tentando esconder as lágrimas com o seu avental de jardinagem.");
			   System.out.println("Você gostaria de enfeza-la?");
			    quest = keyboard.next();
			   if ( quest.equals("N") || quest.equals("nao") || quest.equals("Não")) 
			   {
				   System.out.println("Você saiu do jardim.");
				   System.out.printf("1-Jardim de hortênsias;");
				   System.out.printf("2-Jardim de narcisos;");
				   System.out.println("Para qual você deseja ir?");
					garden = keyboard.nextInt();
			   }
			   if ( quest.equals("sim") || quest.equals("s"))
			   {
				   System.out.println("Você vai até ela e pergunta o porquê dela estar chorando.");
				   System.out.println("Ela diz que ninguém quer comprar as flores tristes dela, mesmo sendo importantes.");
				   System.out.println(name + ", você tem duas opções, qual deseja seguir?");
				   System.out.printf("1-Falar que tristeza nem é tão importante assim;");
				   System.out.println("2-Dizer que irá comprar uma mais tarde.");
				    buy = keyboard.nextInt();
				   if (buy == 2) 
				   {
					   System.out.println("A jardineira só fica ainda mais triste, dizendo que todos dizem a mesma coisa, mas nunca voltam.");
					   System.out.println("Fim de jogo.");
					   System.out.println("aperte A para tentar novamente:");
					    again = keyboard.next();
					    if (again.equals("a")) 
					    {
					    	   System.out.println(name + ", você tem duas opções, qual deseja seguir?");
							   System.out.printf("1-Comprar uma flor;");
							   System.out.println("2-Falar que vai comprar mais tarde.");
							    buy = keyboard.nextInt();
					    }
					    
				   }
				   if (buy == 1) 
				   {
					   System.out.println("A jardineira olha para você enquanto franze a sobrancelha.");
					   System.out.println("Enxugando as lágrimas, ela fica irritada, começando um monólogo do porquê a tristeza é importante.");
					   System.out.println("Ao sair correndo do jardim, você ouve saindo de lá de dentro um:");
					   System.out.println("- E não volte mais! ");
					   System.out.println("Para onde quer ir agora?");
					   System.out.printf("1-O jardim de narcisos.");
						 garden2 = keyboard.nextInt();
						 if (garden2== 1)
						 {
							 System.out.println("Ao entrar no jardim de narcisos, você vê uma mulher saltitante.");
							   System.out.println("Ela está jogando petalas para cima e quase que não percebe você.");
							   System.out.println("Ao perceber, ela te chama, com um sorriso que estampa todos os dentes dela.");
							   System.out.println("Você gostaria de ir até ela?");
							    quest = keyboard.next();
							   if ( quest.equals("N") || quest.equals("nao") || quest.equals("Não")) 
							   {
								   System.out.println("Você saiu do jardim.");
								   System.out.printf("1-Jardim de hortênsias;");
								   System.out.printf("2-Jardim de narcisos.");
								   System.out.println("Para qual você deseja ir?");
									garden = keyboard.nextInt();
							   }
							   if ( quest.equals("sim") || quest.equals("s"))
							   {
										   System.out.println("Você vai até ela, sendo recebido com uma chuva de pétalas.");
										   System.out.println("Ela pergunta o que você acha do jardim dela.");
										   System.out.println(name + ", o que você responderá?");
										   System.out.printf("1-As hortênsias são muito mais alegres;");
										   System.out.println("2-Narcisos são plantas que exalam felicidade!");
										    buy = keyboard.nextInt();
										   if (buy == 2) 
										   {
											   System.out.println("A jardineira fica ainda mais feliz, concordando com o que você disse e saltidando como nunca antes tinha feito.");
											   System.out.println("Fim de jogo.");
											   System.out.println("aperte A para tentar novamente:");
											    again = keyboard.next();
											    if (again.equals("a")) 
											    {
											    	   System.out.println(name + ", você tem duas respostas em mente, qual deseja falar?");
											    	   System.out.printf("1-As hortênsias são muito mais alegres;");
													   System.out.println("2-Narcisos são plantas que exalam felicidade!");
													    buy = keyboard.nextInt();
											    }
											    
										   }
										   if (buy == 1) 
										   {
											   System.out.println("A jardineira olha para você com confusão.");
											   System.out.println("Logo após, com o seu sorriso sumindo, ela para de pular, ficando irritada.");
											   System.out.println("Ela te expulsará do jardim.");
												System.out.printf("Após ver bochechas ficando coradas de raiva, " + name);
										    	System.out.println(", Você pode finalmente descansar dessa droga de objetivo, pois finalmente conseguiu transformar a felicidade e a tristeza em raiva.");
										    	System.out.println("Estou orgulhoso de você!");
										    	System.out.println("Obrigado por jogar.");
										    	System.out.println("Fim de jogo.");
										    	keyboard.close();
										   }
							 
							   }
						 }
						 }
						 
					   }
			   if (! quest.equals("N") || ! quest.equals("nao") || ! quest.equals("Não") || ! quest.equals("s") || ! quest.equals("sim"))
			   {
				   System.out.println("Por favor, responda corretamente:");
				   quest = keyboard.next();
			   }
			  
		
	}
		 if(garden == 2)
		 {
			 System.out.println("Ao entrar no jardim de narcisos, você vê uma mulher saltitante.");
			   System.out.println("Ela está jogando petalas para cima e quase que não percebe você.");
			   System.out.println("Ao perceber, ela te chama, com um sorriso que estampa todos os dentes dela.");
			   System.out.println("Você gostaria de ir até ela?");
			    quest = keyboard.next();
			   if ( quest.equals("N") || quest.equals("nao") || quest.equals("Não")) 
			   {
				   System.out.println("Você saiu do jardim.");
				   System.out.printf("1-Jardim de hortênsias;");
				   System.out.printf("2-Jardim de narcisos.");
				   System.out.println("Para qual você deseja ir?");
					garden = keyboard.nextInt();
			   }
			   if ( quest.equals("sim") || quest.equals("s"))
			   {
						   System.out.println("Você vai até ela, sendo recebido com uma chuva de pétalas.");
						   System.out.println("Ela pergunta o que você acha do jardim dela.");
						   System.out.println(name + ", o que você responderá?");
						   System.out.printf("1-As hortênsias são muito mais alegres;");
						   System.out.println("2-Narcisos são plantas que exalam felicidade!");
						    buy = keyboard.nextInt();
						   if (buy == 2) 
						   {
							   System.out.println("A jardineira fica ainda mais feliz, concordando com o que você disse e saltidando como nunca antes tinha feito.");
							   System.out.println("Fim de jogo.");
							   System.out.println("aperte A para tentar novamente:");
							    again = keyboard.next();
							    if (again.equals("a")) 
							    {
							    	   System.out.println(name + ", você tem duas respostas em mente, qual deseja falar?");
							    	   System.out.printf("1-As hortênsias são muito mais alegres;");
									   System.out.println("2-Narcisos são plantas que exalam felicidade!");
									    buy = keyboard.nextInt();
							    }
							    
						   }
						   if (buy == 1) 
						   {
							   System.out.println("A jardineira olha para você com confusão.");
							   System.out.println("Logo após, com o seu sorriso sumindo, ela para de pular, ficando irritada.");
							   System.out.println("Ela te expulsará do jardim.");
							   System.out.println("Para onde quer ir agora?");
							   System.out.printf("1-O jardim de hortênsias.");
								 garden2 = keyboard.nextInt();
								 if (garden2== 1)
								 {
									 System.out.println("Ao entrar no jardim de hortênsias, você vê uma mulher no horizonte.");
									   System.out.println("Seus cabelos e seus olhos possuem a mesma cor: um azul que se destaca entre a paisagem arroxeada.");
									   System.out.println("Em sua mão direita há um buquê. Ele ainda é pequeno, mas está crescendo pouco a pouco.");
									   System.out.println("Ela começou a chorar, tentando esconder as lágrimas com o seu avental de jardinagem.");
									   System.out.println("Você gostaria de enfeza-la?");
									    quest = keyboard.next();
									   if ( quest.equals("N") || quest.equals("nao") || quest.equals("Não")) 
									   {
										   System.out.println("Você saiu do jardim.");
										   System.out.printf("1-Jardim de hortênsias;");
										   System.out.printf("2-Jardim de narcisos;");
										   System.out.println("Para qual você deseja ir?");
											garden = keyboard.nextInt();
									   }
									   if ( quest.equals("sim") || quest.equals("s"))
									   {
										   System.out.println("Você vai até ela e pergunta o porquê dela estar chorando.");
										   System.out.println("Ela diz que ninguém quer comprar as flores tristes dela, mesmo sendo importantes.");
										   System.out.println(name + ", você tem duas opções, qual deseja seguir?");
										   System.out.printf("1-Falar que tristeza nem é tão importante assim;");
										   System.out.println("2-Dizer que irá comprar uma mais tarde.");
										    buy = keyboard.nextInt();
										   if (buy == 2) 
										   {
											   System.out.println("A jardineira só fica ainda mais triste, dizendo que todos dizem a mesma coisa, mas nunca voltam.");
											   System.out.println("Fim de jogo.");
											   System.out.println("aperte A para tentar novamente:");
											    again = keyboard.next();
											    if (again.equals("a")) 
											    {
											    	   System.out.println(name + ", você tem duas opções, qual deseja seguir?");
													   System.out.printf("1-Comprar uma flor;");
													   System.out.println("2-Falar que vai comprar mais tarde.");
													    buy = keyboard.nextInt();
											    }
											    
										   }
										   if (buy == 1) 
										   {
											   System.out.println("A jardineira olha para você enquanto franze a sobrancelha.");
											   System.out.println("Enxugando as lágrimas, ela fica irritada, começando um monólogo do porquê a tristeza é importante.");
											   System.out.println("Ao sair correndo do jardim, você ouve saindo de lá de dentro um:");
											   System.out.println("- E não volte mais! ");
											   System.out.printf("Após ver bochechas ficando coradas de raiva, " + name);
										    	System.out.println(", Você pode finalmente descansar dessa droga de objetivo, pois finalmente conseguiu transformar a felicidade e a tristeza em raiva.");
										    	System.out.println("Estou orgulhoso de você!");
										    	System.out.println("Obrigado por jogar.");
										    	System.out.println("Fim de jogo.");
										    	keyboard.close();
										   }
									   }
											   
									 
								 }
						   }
			   }
		 }
}
}
}
}
