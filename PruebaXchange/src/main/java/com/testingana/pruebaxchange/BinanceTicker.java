/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.testingana.pruebaxchange;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import org.knowm.xchange.Exchange;
import org.knowm.xchange.ExchangeFactory;
import org.knowm.xchange.binance.BinanceExchange;
import org.knowm.xchange.binance.dto.marketdata.BinanceTicker24h;
import org.knowm.xchange.binance.service.BinanceMarketDataService;
import org.knowm.xchange.currency.CurrencyPair;

/**
 *
 * @author aguarisma
 */
public class BinanceTicker {
    public static void main(String[] args) throws IOException {
        Exchange exchange = ExchangeFactory.INSTANCE.createExchange(BinanceExchange.class.getName());
        BinanceMarketDataService marketDataService = (BinanceMarketDataService) exchange.getMarketDataService();
        BinanceTicker24h ticker = marketDataService.ticker24h(CurrencyPair.BTC_USDT);
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy hh:mm a");
        System.out.println("Currency pair: " + ticker.getCurrencyPair());
        System.out.println("Ask price: " + String.format("%.2f%%",ticker.getAskPrice()));
        System.out.println("Ask quantity: " + ticker.getAskQty());
        System.out.println("Bid price: " + String.format("%.2f%%",ticker.getBidPrice()));
        System.out.println("Bid quantity: " + String.format("%.2f%%",ticker.getBidQty()));
        System.out.println("Close time: " + format.format(ticker.getCloseTime())); 
        System.out.println("First trade id: " + ticker.getFirstTradeId());
        System.out.println("High price: " + String.format("%.2f%%",ticker.getHighPrice()));
        System.out.println("Last Price: " + String.format("%.2f%%", ticker.getLastPrice()));
        System.out.println("Last quantity: " + ticker.getLastQty());
        System.out.println("Last trade id: " + ticker.getLastTradeId());
        System.out.println("Low price: " + String.format("%.2f%%",ticker.getLowPrice()));
        System.out.println("Open price: " + String.format("%.2f%%",ticker.getOpenPrice()));
        System.out.println("Open time: " + format.format(ticker.getOpenTime()));
        System.out.println("Prev close price: " + String.format("%.2f%%",ticker.getPrevClosePrice()));
        System.out.println("Price change: " + String.format("%+.2f%%",ticker.getPriceChange())); 
        System.out.println("Price change percent: " + String.format("%+.2f%%", ticker.getPriceChangePercent())); 
        System.out.println("Quote volume: " + String.format("%.2f%%",ticker.getQuoteVolume()));
        System.out.println("Symbol: " + ticker.getSymbol());
        System.out.println("Trade count: " + ticker.getTradeCount());
        System.out.println("Volume: " + String.format("%.2f%%",ticker.getVolume()));
        System.out.println("Weighted avg. price: " + String.format("%.2f%%",ticker.getWeightedAvgPrice()));
  }
}
