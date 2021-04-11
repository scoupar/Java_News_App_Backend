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
        Article article1 = new Article("Beckhams cash in despite fashion empire profits plunge", "David and Victoria Beckham’s business empire paid out £38m to its owners despite a huge fall in profits.", "David and Victoria Beckham’s business empire has paid out £38m to its owners despite a near 90% fall in profits prompted by difficulties at the former Spice Girl’s fashion label.\n" +
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
                "This year Beckham launched her own makeup line. In 2017 she began a tie up with the sportswear firm Reebok.", LocalDate.of(2021, 3, 12), gregor, Category.News, "https://i.guim.co.uk/img/media/b2eaa2c900b45d602a93a6b5510e886d622f6cf7/0_375_4365_2619/master/4365.jpg?width=620&quality=85&auto=format&fit=max&s=8880a65df7db544be2b8e69a637991bb");
        articleRepository.save(article1);
        Article article2 = new Article("Prince Philip: Scotland hails 'a remarkable man'", "Tributes have been paid in Scotland to the Duke of Edinburgh following his death aged 99.", "Tributes have been paid in Scotland to the Duke of Edinburgh following his death at the age of 99.\n" +
                "Political leaders have sent their condolences to the royal family and parties have suspended their Scottish Parliament election campaigns.\n" +
                "Presiding Officer Ken McIntosh said flags at Holyrood had been lowered as a mark of respect.\n" +
                "The organisers of the Duke of Edinburgh Award scheme described him as \"a remarkable man\".\n" +
                "Prince Philip had a long and close association with Scotland which dates back to his school days in the 1930s.\n" +
                "He attended Gordonstoun in Moray, and he and the Queen were regular visitors to the Balmoral estate in Royal Deeside for many decades.\n" +
                "First Minister Nicola Sturgeon said Prince Philip, who became the Duke of Edinburgh in 1947, had \"deep and longstanding\" ties to Scotland.", LocalDate.of(2021, 3, 10), tina, Category.Entertainment, "https://ichef.bbci.co.uk/news/976/cpsprodpb/15C7A/production/_117901298_gettyimages-598902202-1.jpg");
        articleRepository.save(article2);
        Article article3 = new Article("Celtic: Kennedy urges patience over new manager", "Fans urged to be patient as Parkhead chiefs continue search for new manager.","Celtic fans must be patient in waiting for the appointment of a new manager, says interim boss John Kennedy.\n" +
               "Eddie Howe has held advanced talks with the Parkhead side, but reports suggest he wants to wait until the summer before returning to the dugout.\n" +
                "No terms have been agreed with the former Bournemouth manager.\n" +
                "\"I know it's difficult without clarity. The club have to make the right decision for the greater good going forward,\" Kennedy said.", LocalDate.of(2021, 3, 12), scott, Category.Sports, "https://ichef.bbci.co.uk/onesport/cps/800/cpsprodpb/A134/production/_117886214_20086268.jpg");
        articleRepository.save(article3);
        Article article4 = new Article("Greensill lobbying row - Rishi Sunak texts to David Cameron released", "Text messages sent by the chancellor to former PM David Cameron have been released by the Treasury amid a lobbying row.", "The Treasury has released two text messages sent by Rishi Sunak to David Cameron amid an ongoing lobbying row.\n" +
               "Mr Cameron sent messages to the chancellor's private phone last year to ask for help for finance firm Greensill Capital, where he worked as an adviser.\n" +
                "The firm was run by Lex Greensill - a former unpaid adviser to the ex-PM during his time in No 10.\n" +
                "The texts show Mr Sunak told Mr Cameron his request for access to government-backed loans was being examined.\n" +
                "Mr Cameron's messages to Mr Sunak have not been released.\n" +
                "In a document detailing the messages, officials said Mr Cameron had sent the messages as a Greensill employee with an expectation that they would remain confidential.\n" +
                "It also revealed that the former PM had contacted two other Treasury ministers - Jesse Norman and John Glen - about the company.\n" +
                "A source close to Mr Sunak said Mr Cameron had messaged the chancellor \"multiple times\" on his personal phone.\n" +
               "The source added Mr Sunak had chosen to publish the messages \"in order to reassure beyond doubt that there was no wrongdoing and that he acted with integrity and propriety\".\n" +
                "But Labour's shadow chancellor, Anneliese Dodds, said the messages \"raise very serious questions about whether the chancellor may have broken the ministerial code\", saying they suggested the firm \"got accelerated treatment and access to officials\" and Mr Sunak \"pushed officials to consider Greensill's requests\".", LocalDate.of(2021, 3, 5), helen, Category.Politics, "https://ichef.bbci.co.uk/news/976/cpsprodpb/AB7F/production/_117630934_64797285-a83e-4a9c-91b2-40f826dc5bef.jpg");
        articleRepository.save(article4);
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
