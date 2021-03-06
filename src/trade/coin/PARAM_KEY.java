package trade.coin;

public enum PARAM_KEY {
	//REQ,RESP COMMON
	/**getLong */
	id,
	/**getString */
	rate,
	/**getString */
	amount,
	/**getString */
	order_type,
	pair,
	//REQUEST
	market_buy_amount,
	market_buy,
	market_sell,
	//RESPONSE
	/**getBoolean */
	success,
	/**getString */
	created_at,
	/**JSON Array */
	data,
	/**getLong */
	order_id,
	/**JSON Array */
	orders,
	/**getString */
	pending_amount,
	/**JSON Object */
	funds,
	/**getString */
	btc,
	/**getString */
	email,
	;
}
