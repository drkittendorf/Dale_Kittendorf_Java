package com.challenge.M2ChallengeKittendorfDale.controller;

import com.challenge.M2ChallengeKittendorfDale.models.Quote;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


@RestController
public class QuoteController {
    Random random = new Random();


    private static List<Quote> quoteList= new ArrayList<> (Arrays.asList(
            new Quote (1,
                    "John Mason Goode",
                    "Happiness consists in activity. It is running stream, not a stagnant pool."),
            new Quote (2,
                    "Abraham Lincoln",
                    "I'm a success today because I had a friend who believed in me and I didn't have the heart to let him down."),
            new Quote (3,
                    "Rene Descartes",
                    "It is not enough to have a good mind; the main thing is to use it well."),
            new Quote (4,
                    "Albert Einstein",
                    "It is not that I'm so smart.But I stay with the questions much longer."),
            new Quote (5,
                    "Jonathan Swift",
                    "May You live every day of your life."),
            new Quote (6,
                    "Theodore Roosevelt",
                   "Far and away the best prize that life has to offer is the chance to work hard at work worth doing."),
            new Quote (7,
                   "Marion Zimmer Bradley",
                   "It has never been, and never will be, easy work! But the road that is built in hope is more pleasant to the traveler than the road built in despair, even though they both lead to the same destination."),
            new Quote (8,
                   "Og Mandino",
                   "The great difference between those who succeed and those who fail does not consist in the amount of work done by each but in the amount of intelligent work."),
            new Quote (9,
                   "Friedrich Nietzsche",
                   "“All truly great thoughts are conceived while walking"),
            new Quote (10,
                   "Tony Robbins",
                   "Changing an organization, a company, a country—or a world—begins with the simple step of changing yourself.")
            ));

    @RequestMapping(value = "/quote", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Quote getQuote() {
        Quote newQuote = new Quote();

        int randomQuoteIndex = random.nextInt(quoteList.size());
        Quote randomQuote = quoteList.get(randomQuoteIndex);
//        System.out.println(randomQuote);


        return randomQuote;
    };

}







//- Quote API:
//  - URI: /quote
//  - Method: GET
//  - Request Body: None
//  - Response Body: Quote
//- Quote Object instance variables:
//  - id
//  - author
//  - quote