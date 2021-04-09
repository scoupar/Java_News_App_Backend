package com.codeclan.example.SGNNNewsApp.components;


import com.codeclan.example.SGNNNewsApp.model.Article;
import com.codeclan.example.SGNNNewsApp.model.Category;
import com.codeclan.example.SGNNNewsApp.model.Journalist;
import com.codeclan.example.SGNNNewsApp.repository.ArticleRepository;
import com.codeclan.example.SGNNNewsApp.repository.JournalistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements ApplicationRunner {



    @Autowired
    ArticleRepository articleRepository;

    @Autowired
    JournalistRepository journalistRepository;


    public DataLoader() {

    }

    public void run (ApplicationArguments args) {
        Journalist gregor = new Journalist("Gregor Simpson", "Crime reporter");
        journalistRepository.save(gregor);
        Journalist tina = new Journalist("Tina Houston", "Chief feature writer");
        journalistRepository.save(tina);
        Journalist scott = new Journalist("Scott Coupar", "Chief sports writer");
        journalistRepository.save(scott);
        Journalist helen = new Journalist("Helen Aguda", "Politics editor");
        journalistRepository.save(helen);
        Article article1 = new Article("Article1", "David and Victoria Beckham’s business empire has paid out £38m to its owners despite a near 90% fall in profits prompted by difficulties at the former Spice Girl’s fashion label.\n" +
                "The former England footballer, the fashion entrepreneur and their business partner Simon Fuller paid themselves dividends of $21.5m (£16.7m) and £10.3m in May this year, on top of £11.1m in 2018, according to accounts for Beckham Brand Holdings (BBH) published at Companies House on Friday.\n" +
                "The payouts were made despite a plunge in pre-tax profits to just £1.7m in the year to 31 December 2018 after turnover fell by 18% to £45.8m. Profits were hit by widening losses at Victoria Beckham’s fashion label and the sale of a 51% stake in Seven Global, which manages some of her husband’s corporate partnerships.\n" +
                "Advertisement\n" +
                "The payouts include a final windfall for Fuller from BBH after the Beckhams bought out the former Spice Girls manager and Pop Idol founder’s XIX Entertainment group last year.\n" +
                "But Fuller remains a shareholder in Victoria Beckham Ltd (VBL), the ailing fashion label which is a key part of the BBH group. The Beckhams, Fuller and the private equity firm Neo Investment Partners were forced to pump £13.5m into VBL last year to keep it afloat. Sales at the label slid 16% to £35m last year while it racked up its 11th year of operating losses.\n" +
                "Pre-tax losses at VBL widened to £12.2m from £10.3m a year previously after department stores, mainly in south-east Asia, cut orders for Beckham’s designs which include a £3,000 skirt and coats for over £2,000.\n" +
                "The performance meant VBL breached the terms of its bank loans – which now amount to about £10m, up from less than £2m in 2014. The luxury brand, which is sold in more than 400 stores worldwide including two of its own stores in London and Hong Kong, has racked up about £35m of losses since it was founded in 2008.\n" +
                "Its survival has been underpinned by more than £8.4m in loans from David Beckham’s holding company as well as a £4m cash deposit used as security for VBL’s bank loans and other financing.\n" +
                "The financial issues come despite the company cutting costs by more than £3m, laying off more than 20 staff and moving its main office to Hammersmith in west London from Battersea. Among those to leave, was Paolo Riva after just 10 months as chief executive.\n" +
                "Having started with three staff and a small collection of dresses modelled on the items Victoria Beckham loved to wear, the brand has developed into a polished edgy collection, on a par with her heroes Donna Karan and Phoebe Philo, who was creative director at Celine until last year.\n" +
                "VBL is a relatively small fashion label. It now employs about 150 people after the recent job cuts, has an annual wage bill of about £10m and two offices in London and one in New York.\n" +
                "Nicla Di Palma, an analyst at stockbroker Brewin Dolphin, said: “The natural trajectory for small luxury brands is to start by losing money due to start up, marketing and other costs and continue to lose money for a few years while they scale up globally – so Victoria Beckham is not atypical in that.”\n" +
                "VBL’s chairman, Ralph Toledano, who joined after Neo took a £30m stake in the label in 2017, has begun an efficiency drive and is also trying to broaden the brand’s appeal.\n" +
                "He told the Business of Fashion trade journal that the brand’s prices were also a “real, real issue” and this year he slashed them by between 20% and 30%. “I firmly believe that our destiny is in our hands. We have a great talent in Victoria and, if you take that asset with a dream team, we can do it,” he added.\n" +
                "This year Beckham launched her own makeup line. In 2017 she began a tie up with the sportswear firm Reebok.", LocalDate.of(2021, 3, 12), gregor, Category.News);
        articleRepository.save(article1);
        Article article2 = new Article("Article2", "Lorem ipsum dolor sit amet", LocalDate.of(2021, 3, 10), tina, Category.Entertainment);
        articleRepository.save(article2);
        Article article3 = new Article("Article3", "Lorem ipsum dolor sit amet", LocalDate.of(2021, 3, 12), scott, Category.Sports);
        articleRepository.save(article3);
        Article article4 = new Article("Article4", "Lorem ipsum dolor sit amet", LocalDate.of(2021, 3, 5), helen, Category.Politics);
        articleRepository.save(article1);
        gregor.addArticle(article1);
        journalistRepository.save(gregor);
        helen.addArticle(article4);
        journalistRepository.save(helen);
        tina.addArticle(article2);
        journalistRepository.save(tina);
        scott.addArticle(article3);
        journalistRepository.save(scott);

    }
}
