package qaautomation.march2022;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import qaautomation.march2022.utils.GraphQLRequestBuilder;
import static io.restassured.RestAssured.given;
public class GraphQLTest {

	@Test
	public void checkCEO() {
		GraphQLRequestBuilder gql = new GraphQLRequestBuilder();
		String query = "{  company {    ceo    coo    cto  }}";
		gql.setQuery(query);
		String jsonStringQuery = gql.getJSONString();
		
		Response response = given().contentType(ContentType.JSON).body(jsonStringQuery)
				.when().post("http://api.spacex.land/graphql/");
		String ceoName = response.jsonPath().get("data.company.ceo");
		assertEquals(ceoName, "Elon Musk");

	} 
}
