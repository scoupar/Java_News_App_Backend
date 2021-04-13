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
        Journalist gregor = new Journalist("Gregor Simpson", "Chief reporter");
        journalistRepository.save(gregor);
        Journalist tina = new Journalist("Tina Houston", "Chief feature writer");
        journalistRepository.save(tina);
        Journalist scott = new Journalist("Scott Coupar", "Chief sports writer");
        journalistRepository.save(scott);
        Journalist helen = new Journalist("Helen Aguda", "Politics editor");
        journalistRepository.save(helen);

        Article article1 = new Article("Beckhams cash in despite fashion empire profits plunge", "David and Victoria Beckham’s business empire paid out £38m to its owners despite a huge fall in profits.", "David and Victoria Beckham’s business empire has paid out £38m to its owners despite a near 90% fall in profits prompted by difficulties at the former Spice Girl’s fashion label.\n" +
                "\n" +
                "The former England footballer, the fashion entrepreneur and their business partner Simon Fuller paid themselves dividends of $21.5m (£16.7m) and £10.3m in May this year, on top of £11.1m in 2018, according to accounts for Beckham Brand Holdings (BBH) published at Companies House on Friday.\n" +
                "\n" +
                "The payouts were made despite a plunge in pre-tax profits to just £1.7m in the year to 31 December 2018 after turnover fell by 18% to £45.8m. Profits were hit by widening losses at Victoria Beckham’s fashion label and the sale of a 51% stake in Seven Global, which manages some of her husband’s corporate partnerships.\n" +
                "\n" +
                "The payouts include a final windfall for Fuller from BBH after the Beckhams bought out the former Spice Girls manager and Pop Idol founder’s XIX Entertainment group last year.\n" + "\n" +
                "\n" +
                "But Fuller remains a shareholder in Victoria Beckham Ltd (VBL), the ailing fashion label which is a key part of the BBH group. The Beckhams, Fuller and the private equity firm Neo Investment Partners were forced to pump £13.5m into VBL last year to keep it afloat. Sales at the label slid 16% to £35m last year while it racked up its 11th year of operating losses.\n" +
                "\n" +
                "Pre-tax losses at VBL widened to £12.2m from £10.3m a year previously after department stores, mainly in south-east Asia, cut orders for Beckham’s designs which include a £3,000 skirt and coats for over £2,000.\n" +
                "\n" +
                "The performance meant VBL breached the terms of its bank loans – which now amount to about £10m, up from less than £2m in 2014. The luxury brand, which is sold in more than 400 stores worldwide including two of its own stores in London and Hong Kong, has racked up about £35m of losses since it was founded in 2008.\n" +
                "\n" +
                "Its survival has been underpinned by more than £8.4m in loans from David Beckham’s holding company as well as a £4m cash deposit used as security for VBL’s bank loans and other financing.\n" +
                "\n" +
                "The financial issues come despite the company cutting costs by more than £3m, laying off more than 20 staff and moving its main office to Hammersmith in west London from Battersea. Among those to leave, was Paolo Riva after just 10 months as chief executive.\n" +
                "\n" +
                "Having started with three staff and a small collection of dresses modelled on the items Victoria Beckham loved to wear, the brand has developed into a polished edgy collection, on a par with her heroes Donna Karan and Phoebe Philo, who was creative director at Celine until last year.\n" +
                "\n" +
                "VBL is a relatively small fashion label. It now employs about 150 people after the recent job cuts, has an annual wage bill of about £10m and two offices in London and one in New York.\n" +
                "\n" +
                "Nicla Di Palma, an analyst at stockbroker Brewin Dolphin, said: “The natural trajectory for small luxury brands is to start by losing money due to start up, marketing and other costs and continue to lose money for a few years while they scale up globally – so Victoria Beckham is not atypical in that.”\n" +
                "\n" +
                "VBL’s chairman, Ralph Toledano, who joined after Neo took a £30m stake in the label in 2017, has begun an efficiency drive and is also trying to broaden the brand’s appeal.\n" +
                "\n" +
                "He told the Business of Fashion trade journal that the brand’s prices were also a “real, real issue” and this year he slashed them by between 20% and 30%. “I firmly believe that our destiny is in our hands. We have a great talent in Victoria and, if you take that asset with a dream team, we can do it,” he added.\n" +
                "This year Beckham launched her own makeup line. In 2017 she began a tie up with the sportswear firm Reebok.", LocalDate.of(2021, 3, 12), gregor, Category.News, "https://i.guim.co.uk/img/media/b2eaa2c900b45d602a93a6b5510e886d622f6cf7/0_375_4365_2619/master/4365.jpg?width=620&quality=85&auto=format&fit=max&s=8880a65df7db544be2b8e69a637991bb", 0L);
                
                
        articleRepository.save(article1);

        Article article2 = new Article("Prince Philip: Scotland hails 'a remarkable man'", "Tributes have been paid in Scotland to the Duke of Edinburgh following his death aged 99.", "Tributes have been paid in Scotland to the Duke of Edinburgh following his death at the age of 99.\n" +
                "\n" +
                "Political leaders have sent their condolences to the royal family and parties have suspended their Scottish Parliament election campaigns.\n" +
                "\n" +
                "Presiding Officer Ken McIntosh said flags at Holyrood had been lowered as a mark of respect.\n" +
                "\n" +
                "The organisers of the Duke of Edinburgh Award scheme described him as \"a remarkable man\".\n" +
                "\n" +
                "Prince Philip had a long and close association with Scotland which dates back to his school days in the 1930s.\n" +
                "\n" +
                "He attended Gordonstoun in Moray, and he and the Queen were regular visitors to the Balmoral estate in Royal Deeside for many decades.\n" +
                "First Minister Nicola Sturgeon said Prince Philip, who became the Duke of Edinburgh in 1947, had \"deep and longstanding\" ties to Scotland.", LocalDate.of(2021, 3, 10), tina, Category.Entertainment, "https://ichef.bbci.co.uk/news/976/cpsprodpb/15C7A/production/_117901298_gettyimages-598902202-1.jpg", 0L);
                
        articleRepository.save(article2);

        Article article3 = new Article("Celtic: Kennedy urges patience over new manager", "Fans urged to be patient as Parkhead chiefs continue search for new manager.","Celtic fans must be patient in waiting for the appointment of a new manager, says interim boss John Kennedy.\n" +
                "\n" +
                "Eddie Howe has held advanced talks with the Parkhead side, but reports suggest he wants to wait until the summer before returning to the dugout.\n" +
                "\n" +
                "No terms have been agreed with the former Bournemouth manager.\n" +
                "\"I know it's difficult without clarity. The club have to make the right decision for the greater good going forward,\" Kennedy said.", LocalDate.of(2021, 3, 12), scott, Category.Sports, "https://ichef.bbci.co.uk/onesport/cps/800/cpsprodpb/A134/production/_117886214_20086268.jpg", 0L);
        articleRepository.save(article3);

        Article article4 = new Article("Greensill lobbying row - Rishi Sunak texts to David Cameron released", "Text messages sent by the chancellor to former PM David Cameron have been released by the Treasury amid a lobbying row.", "The Treasury has released two text messages sent by Rishi Sunak to David Cameron amid an ongoing lobbying row.\n" +
                "\n" +
                "Mr Cameron sent messages to the chancellor's private phone last year to ask for help for finance firm Greensill Capital, where he worked as an adviser.\n" +
                "\n" +
                "The firm was run by Lex Greensill - a former unpaid adviser to the ex-PM during his time in No 10.\n" +
                "\n" +
                "The texts show Mr Sunak told Mr Cameron his request for access to government-backed loans was being examined.\n" +
                "\n" +
                "Mr Cameron's messages to Mr Sunak have not been released.\n" +
                "\n" +
                "In a document detailing the messages, officials said Mr Cameron had sent the messages as a Greensill employee with an expectation that they would remain confidential.\n" +
                "\n" +
                "It also revealed that the former PM had contacted two other Treasury ministers - Jesse Norman and John Glen - about the company.\n" +
                "\n" +
                "A source close to Mr Sunak said Mr Cameron had messaged the chancellor \"multiple times\" on his personal phone.\n" +
               "The source added Mr Sunak had chosen to publish the messages \"in order to reassure beyond doubt that there was no wrongdoing and that he acted with integrity and propriety\".\n" +
                "But Labour's shadow chancellor, Anneliese Dodds, said the messages \"raise very serious questions about whether the chancellor may have broken the ministerial code\", saying they suggested the firm \"got accelerated treatment and access to officials\" and Mr Sunak \"pushed officials to consider Greensill's requests\".", LocalDate.of(2021, 3, 5), helen, Category.Politics, "https://ichef.bbci.co.uk/news/976/cpsprodpb/AB7F/production/_117630934_64797285-a83e-4a9c-91b2-40f826dc5bef.jpg", 0L);
        articleRepository.save(article4);

        Article article5 = new Article("Fishing boat sank due to engine room flooding", "A report has found flooding in the engine room caused a Scots trawler to sink.", "A fishing boat sank off the Scottish coast because of engine room flooding, a report has said.\n" +
                "\n" +
                "The Fraserburgh-registered Ocean Quest started taking on water 70 miles (113km) off the Aberdeenshire town in August 2019.\n" +
                "\n" +
                "Pumping did not control the situation and a Coastguard rescue helicopter had to winch the five crew to safety.\n" +
                "\n" +
                "The Marine Accident Investigation Branch (MAIB) said the flooding source had not been absolutely clear.\n" +
                "\n" +
                "However, the report said it was \"almost certainly the result of a shell-plating or hull-weld failure beneath the main engine\". It explained: \"Although every effort was made by the crew to bring the flood under control, the onboard pumping effort was not fully optimised.\n" +
               "The sea water suctions had been left partly open after pumping started, which allowed the pumps to continue drawing in sea water while they were trying to drain the engine room. This was said to not be appropriate during such an emergency.\n" +
               "The report added: \"Ocean Quest's crew were well prepared for the abandonment having routinely practised for such an emergency.\n" +
                "The alarm was raised in good time and the subsequent rescue ensured everyone was safely transferred ashore.\"", LocalDate.of(2021, 04, 20), gregor, Category.News, "https://ichef.bbci.co.uk/news/976/cpsprodpb/B660/production/_117888664_oceanquestmaib.jpg", 0L);
        articleRepository.save(article5);

        Article article6 = new Article("Glasgow museums and venues to reopen from 26 April", "Public buildings in Glasgow including galleries and museums will reopen this month.", "Glasgow's Kelvingrove Art Gallery, Riverside Museum, Emirates Arena and other public buildings are set to reopen from 26 April.\n" +
                "\n" +
                "Glasgow Life has announced opening dates for more than 90 city venues over the following weeks.\n" +
                "\n" +
                "The charity, which delivers culture and leisure services for Glasgow City Council, said visitor numbers would be restricted due to social distancing.\n" +
                "\n" +
                "The move comes as Covid lockdown restrictions are eased in Scotland.\n" +
                "Glasgow Life said reopenings would be subject to local infection rates and the city being in, or below, level three of the Scottish government's Covid protection levels.\"", LocalDate.of(2021, 04, 12), gregor, Category.News, "https://ichef.bbci.co.uk/news/976/cpsprodpb/100DE/production/_117885756_glasgowlifekelvingroveartgalleryandmuseum2.jpg", 0L);
        articleRepository.save(article6);

        Article article7 = new Article("DMX, American rapper and actor, dies aged 50", "US rapper DMX has died five days after suffering a heart attack.", "US rapper and actor DMX has died at the age of 50, five days after suffering a heart attack.\n" +
                "\n" +
                "The performer, whose real name was Earl Simmons, had been placed on life support and died with his family by his side.\n" +
                "\n" +
                "In a statement, his family said he was \"a warrior who fought till the very end.\n" +
                "Earl's music inspired countless fans across the world and his iconic legacy will live on forever,\" they said.", LocalDate.of(2021, 04, 8), tina, Category.Entertainment, "https://ichef.bbci.co.uk/news/976/cpsprodpb/16C0/production/_117942850_gettyimages-1173545968.jpg", 0L);
        articleRepository.save(article7);

        Article article8 = new Article("Nikki Grahame's friends 'heartbroken' at Big Brother star's death", "Friends of Big Brother star Nikki Grahame have spoken of their heartbreak following her death.", "Friends of Big Brother star Nikki Grahame have spoken of their heartbreak following her death, aged 38.\n" +
                "\n" +
                "The TV personality had anorexia and friends had set up a crowd fund to pay for her treatment.\n" +
                "\n" +
                "Former Emmerdale actress Gemma Oaten fought back tears in a video, saying: \"I wish I could have done more.\"\n" +
                "\n" +
                "Friends also posted on Nikki's fundraising page: \"It breaks our hearts to know that someone who is so precious was taken from us at such a young age.\n" +
                "\n" +
                "Nikki not only touched the lives of millions of people, but also her friends and family who will miss her immensely.\"In her video, Gemma Oaten said: \"I am so sorry Nikki to lose such a beautiful and bright human being... I wish I could have done more.\"\n" +
                "\n" +
                "The actress had anorexia herself and founded SEED Eating Disorder Services Charity with her mother Marg Oaten.\n" +
                "\n" +
                "Speaking to BBC Radio 5 live, Marg Oaten said she hoped Nikki's death would raise awareness of \"how cruel this illness is\".\n" +
                "\n" +
                "Joanne Byrne, CEO of Anorexia and Bulimia Care, tweeted that she was \"devastated\". She said: \"A beautiful, fragile girl who struggled with anorexia for over 30 years. We must be able to do more for people like Nikki.\"\n" +
                "\n" +
                "Harriet Clifford said she had got to know Grahame over several months of inpatient treatment for eating disorders. She described her as \"caring, big-hearted and admirably open\".\n" +
                "\n" +
                "She told the BBC: \"It was a privilege to have met her, even though we were all going through really horrific times in our lives. She brightened up the place with her infectious personality.\"\n" +
                "\n" +
                "Mental health campaigner Hope Virgo told BBC Breakfast she was hospitalised with an eating disorder aged 17 and hoped Nikki's story would encourage others to seek help.\n" +
                "She said: \"Life on the other side of an eating disorder, there's just so much positivity and so much potential.\"", LocalDate.of(2021, 04, 11), tina, Category.Entertainment, "https://ichef.bbci.co.uk/news/976/cpsprodpb/1817D/production/_117958689_nggettyimages-157813565.jpg", 0L);
        articleRepository.save(article8);

        Article article9 = new Article("MotoGP: Maverick Vinales wins season opener in Qatar", "Spaniard Maverick Vinales won the MotoGP season opener", "Spaniard Maverick Vinales won the opening race of the MotoGP season in Qatar.\n" +
                "\n" +
                "Vinales overtook Francesco Bagnaia, who started on pole, to move into the lead with eight laps left before securing his ninth win in the premier class.\n" +
                "\n" +
                "Johann Zarco was second as he and third-placed Bagnaia passed reigning champion Joan Mir down the final straight on the last lap.\n" +
                "\n" +
                "Overall, it was so good. It was a fantastic weekend,\" said Vinales.\n" +
                "\n" +
                "I felt unbelievable. The start didn't go so well but after that I felt the potential.\n" +
                "\n" +
                "I tried to be very smart and calm, and took the right place to push. Finally, I opened a gap and I was trying to control the tyres and manage the power.\n" +
                "\n" +
                "Meanwhile, Sam Lowes was victorious in the Moto2 race in Qatar, becoming the first Briton to win a season opener since 1979.\n" +
                "He finished in a time of 40 minutes 3.123 seconds, with Australian Remy Gardner second and Italian Fabio di Giannantonio third.", LocalDate.of(2021, 04, 4), scott, Category.Sports, "https://ichef.bbci.co.uk/onesport/cps/800/cpsprodpb/C480/production/_117740305_gettyimages-1231989493.jpg", 0L);
        articleRepository.save(article9);

        Article article10 = new Article("Rachael Blackmore: Historic Grand National triumph for modest trailblazer", "Rachael Blackmore makes history by becoming first female to win Grand National.", "Like countless young pony riders, Rachael Blackmore watched the film National Velvet starring Elizabeth Taylor and dreamed of one day winning the Grand National.\n" +
                "\n" +
                "On 10 April 2021 she made fantasy a reality. The first female jockey to triumph in the world's most famous steeplechase, with a stirring victory on Minella Times.\n" +
                "\n" +
                "National Velvet was definitely something that would have been on the television when we were growing up. I've got no punchy line to go with it,\" she told me.\n" +
                "\n" +
                "The iconic 1944 film saw Taylor play 12-year-old Velvet Brown who won the National on a gelding called The Pie but was later disqualified on a technicality.\n" +
                "\n" +
                "Blackmore, a quietly spoken and articulate individual, had saved her 'punchy line' for shortly after passing the finishing line on 11-1 chance Minella Times, trained by Henry de Bromhead for owner JP McManus.\n" +
                "\n" +
                "I don't feel male or female right now. I don't even feel human,\" the 31-year-old Irish rider told ITV. \"This is just unbelievable.\"\n" +
                "A little later she paused during an interview as the magnitude of her achievement sank in, took a breath and composed herself before continuing. Wonder woman is human after all.", LocalDate.of(2021, 04, 11), scott, Category.Sports, "https://ichef.bbci.co.uk/onesport/cps/800/cpsprodpb/9E2F/production/_117959404_gettyimages-1311817927.jpg", 0L);
        articleRepository.save(article10);

        Article article11 = new Article("Covid in Scotland: Government 'failed' social care sector during pandemic", "The health secretary has said the government failed to understand needs of social care.", "Scotland's health secretary has said the government failed to properly understand the needs of social care during the pandemic.\n" +
                "\n" +
                "Jeane Freeman said the right precautions had not been taken when elderly people were being discharged from hospital to care homes.\n" +
                "\n" +
                "Ms Freeman told the BBC podcast, Political Thinking with Nick Robinson, that it had been a \"mistake\".\n" +
                "\n" +
                "There have been more than 10,000 Covid-related deaths in Scotland.\n" +
                "\n" +
                "Of that number, a third occurred in care homes.\n" +
                "\n" +
                "In the first wave of the pandemic, more than 1,300 elderly people were discharged from hospitals to care homes in Scotland before a testing regime was in place.\n" +
                "\n" +
                "The Scottish Conservative leader Douglas Ross said the Scottish government's mistakes had \"cost lives\".\n" +
                "Dr Donald MacAskill, of the care home industry body Scottish Care, said there had been so much emphasis on protecting the NHS in the early stages of the pandemic that not enough was done to protect those in social care.", LocalDate.of(2021, 04, 10), helen, Category.Politics, "https://ichef.bbci.co.uk/news/976/cpsprodpb/614D/production/_117890942_care.jpg", 0L);
        articleRepository.save(article11);

        Article article12 = new Article("Scottish election 2021: Lib Dems pledge tax cut to help high street firms", "Liberal Democrats reveal plan to \"shake up\" business rates system.", "The Scottish Liberal Democrats plan to \"shake up\" the business rates system in a bid to help high street shops compete with online competitors.\n" +
                "\n" +
                "Leader Willie Rennie said the party's proposals would cut bills for most properties around the high street.\n" +
                "\n" +
                "Changing the charges to focus on land values would see rises for developers \"land banking\" sites, he said.\n" +
                "\n" +
                "Land banking involves developers buying up sites without developing them, leaving plots under-used or empty.\n" +
                "\n" +
                "The Lib Dems' proposals would make the rates payable by the land owner rather than a business based there.\n" +
                "The party says this will avoid penalising businesses that improve their properties, install renewables or make their customers safer with coronavirus mitigation measures.", LocalDate.of(2021, 04, 2), helen, Category.Politics, "https://ichef.bbci.co.uk/news/976/cpsprodpb/93CE/production/_117883873_highstreet_inverness_getty.jpg", 0L);
        articleRepository.save(article12);

        gregor.addArticle(article1);
        journalistRepository.save(gregor);

        helen.addArticle(article4);
        journalistRepository.save(helen);

        tina.addArticle(article2);
        journalistRepository.save(tina);

        scott.addArticle(article3);
        journalistRepository.save(scott);

        gregor.addArticle(article5);
        journalistRepository.save(gregor);

        gregor.addArticle(article6);
        journalistRepository.save(gregor);

        tina.addArticle(article7);
        journalistRepository.save(tina);

        tina.addArticle(article8);
        journalistRepository.save(tina);

        scott.addArticle(article9);
        journalistRepository.save(scott);

        scott.addArticle(article10);
        journalistRepository.save(scott);

        helen.addArticle(article11);
        journalistRepository.save(helen);

        helen.addArticle(article12);
        journalistRepository.save(helen);

//        gregor.addArticle(article13);
//        journalistRepository.save(gregor);
//
//        tina.addArticle(article14);
//        journalistRepository.save(tina);
    }
}
