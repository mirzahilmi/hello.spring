package id.my.mrz.hello.spring.article;

import org.springframework.context.ApplicationEvent;

public class ArticleDeletedEvent extends ApplicationEvent {
  private final long articleId;

  public ArticleDeletedEvent(Object source, long articleId) {
    super(source);
    this.articleId = articleId;
  }

  public long getArticleId() {
    return articleId;
  }
}
