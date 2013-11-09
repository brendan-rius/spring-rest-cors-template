package web.filters;

/**
 * User: Brendan
 * Date: 06/10/13
 * Time: 15:12
 */

import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CorsFilter extends OncePerRequestFilter
{

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
		throws ServletException, IOException
	{
		if (request.getHeader("Access-Control-Request-Method") != null && "OPTIONS".equals(request.getMethod()))
			{
				response.addHeader("Access-Control-Allow-Origin", "*");
				response.addHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE");
				response.addHeader("Access-Control-Allow-Headers", "X-Requested-With, Origin, Content-Type, Accept");
				response.addHeader("Access-Control-Max-Age", "1800");
			}

		filterChain.doFilter(request, response);
	}
}