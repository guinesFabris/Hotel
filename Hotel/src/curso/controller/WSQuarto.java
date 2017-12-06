package curso.controller;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

/**
 * Servlet implementation class WSQuarto
 */
@WebServlet("/WSQuarto")
public class WSQuarto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     */
    public WSQuarto() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 *//*
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String numero = request.getParameter("NUMERO");
		HotelDAO hDao = new HotelDAOImpl();
		List<Quarto> quartos = hDao.pesquisarPorNumero(numero);
//		for (Quarto q : quartos) { 
//			out.println(q.getId() + "," + q.getNumero() + "," + q.getTipo() + "," + 
//							q.getDescricao() + "," + q.getPreco() + "," + q.getArea());
//		}
		Gson gson = new Gson();
		String textoJson = gson.toJson(quartos);
		out.println( textoJson );
		
	}*/

}
