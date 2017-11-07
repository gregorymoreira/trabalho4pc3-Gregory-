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
		//pegando informa��es enviadas pelo cliente (req)
		nome = req.getParameter("nome");
		sexo = req.getParameter("sexo");
		matricula = req.getParameter("matricula");
		idade = req.getParameter("idade");
		//imprimindo dados para o cliente(out..resp)
		out.println("<head><title>Formulario Trabalho 4");
		out.println("</title></head><body>");
		out.println("<h4>Dados do Formul�rio<h4>");
		out.println("<br>Matricula: "+matricula+"<br>");
		out.println("<br>Nome: "+nome+"<br>");
		out.println("<br>Idade: "+idade+"<br>");
		out.println("<br>Sexo: "+sexo+"<br>");
		
		if(sexo.equalsIgnoreCase("masculino")) {
			int aux=Integer.parseInt(idade);
			if(aux>0 && aux <120){
			if(aux>=18) {
				out.println("<BR>Voc� precisa servir ao ex�rcito!");	
				}
				else {
				out.println("<BR>Voc� est� ok com as obriga��es militares.");
			}
			}else {
				out.println("<br>Sua idade n�o � v�lida.");
			}
		}else {
			out.println("<BR>Voc� n�o precisa servir ao ex�rcito.");
		}

		out.println("<BR></BODY><HTML>");
		out.close();
	}

}
