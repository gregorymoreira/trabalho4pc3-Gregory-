package trabalho4pc3_Gregory;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Formulario")
public class Formulario extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		doPost(req,resp);
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		resp.setContentType("text.html");
		PrintWriter out = resp.getWriter();
		String nome;
		String matricula;
		String idade;
		String sexo;
		//pegando informações enviadas pelo cliente (req)
		nome = req.getParameter("nome");
		sexo = req.getParameter("sexo");
		matricula = req.getParameter("matricula");
		idade = req.getParameter("idade");
		//imprimindo dados para o cliente(out..resp)
		out.println("<head><title>Formulario Trabalho 4");
		out.println("</title></head><body>");
		out.println("<h4>Dados do Formulário<h4>");
		out.println("<br>Matricula: "+matricula+"<br>");
		out.println("<br>Nome: "+nome+"<br>");
		out.println("<br>Idade: "+idade+"<br>");
		out.println("<br>Sexo: "+sexo+"<br>");
		
		if(sexo.equalsIgnoreCase("masculino")) {
			int aux=Integer.parseInt(idade);
			if(aux>0 && aux <120){
			if(aux>=18) {
				out.println("<BR>Você precisa servir ao exército!");	
				}
				else {
				out.println("<BR>Você está ok com as obrigações militares.");
			}
			}else {
				out.println("<br>Sua idade não é válida.");
			}
		}else {
			out.println("<BR>Você não precisa servir ao exército.");
		}

		out.println("<BR></BODY><HTML>");
		out.close();
	}

}
